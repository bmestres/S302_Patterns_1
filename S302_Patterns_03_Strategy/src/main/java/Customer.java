import java.io.Serializable;

public record Customer (
        int id,
        String name,
        String surname,
        String email,
        Gender gender)
        implements Serializable{}
