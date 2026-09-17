import java.io.Serializable;

public record Customer (
        String id,
        String name,
        String surname,
        String email,
        Gender gender)
        implements Serializable{}
