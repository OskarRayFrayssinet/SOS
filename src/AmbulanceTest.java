import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AmbulanceTest {


    @Test
    void testIfAmbulanceIsAvailable(){
        Ambulance a = new Ambulance("AAA111", false);
        assertFalse(a.isAvailable());
    }

    @Test
    void checkIfInDatabase(){
        AmbulanceRepository ambulanceRepository = mock(AmbulanceRepository.class);
        when(ambulanceRepository.findById("1")).thenReturn(Optional.of(new Ambulance("1", true)));

        Ambulance a = ambulanceRepository.findById("1").get();

        verify(ambulanceRepository).findById("1");

        assertNotNull(a);
    }


}
