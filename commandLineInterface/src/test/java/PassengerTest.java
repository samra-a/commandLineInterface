import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import passengers.Passenger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp(){
       passenger = new Passenger("Bella", "07676130187");
    }

    @Test
    public boolean bookPassengerOnFlight{
        //arrange
        assertThat()

    }


}
