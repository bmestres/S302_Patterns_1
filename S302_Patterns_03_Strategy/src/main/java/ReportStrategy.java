import java.io.FileOutputStream;

public interface ReportStrategy {

    String generateReport(Customer customer);

    static ReportStrategy HTMLStrategy() {
        return customer -> {};
    }


}
