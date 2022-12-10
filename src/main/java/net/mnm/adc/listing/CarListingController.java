package net.mnm.adc.listing;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

@Controller("/cars")
@ExecuteOn(TaskExecutors.IO)
public class CarListingController {

    private static Logger logger = LoggerFactory.getLogger(CarListingController.class);

    @Get("/listing")
    public List<Car> getAllCars(){
        logger.debug("Entering CarListingController.getAllCars");
        return Arrays.asList(
                new Car("XUV700", "Best 5 star rated car. Segment leader"),
                new Car("ScorpioN", "The all new Scorpio in its latest avatar"),
                new Car("Thar", "The one and only - midlife crisis creator"),
                new Car("XUV300", "Tivoli under 4 meter with 5 star rating.")
        );
    }

}
