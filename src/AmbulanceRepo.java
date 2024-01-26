import java.util.Optional;

public class AmbulanceRepo {
    Optional<Ambulance> findById(String id){
        return Optional.of(new Ambulance(id, true));
    }
}
