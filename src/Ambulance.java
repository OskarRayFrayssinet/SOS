import org.springframework.data.annotation.Id;

public class Ambulance {

    @Id
    private String id;

    private boolean available;

    public Ambulance(String id, boolean available){
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }
}
