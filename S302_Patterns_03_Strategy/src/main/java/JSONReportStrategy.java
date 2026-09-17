import tools.jackson.databind.ObjectMapper;

public class JSONReportStrategy implements ReportStrategy {
    private static final String DISPLAY_NAME = "JSON Report:";

    @Override
    public String generateReport(Customer customer) {
        ObjectMapper mapper = new ObjectMapper();
        return String.format("%s\n%s",
                DISPLAY_NAME, mapper.writeValueAsString(customer));
    }

    static void main(String[] args) {

        Customer customer = new Customer(
                1,
                "Customer name",
                "Customer surname",
                "email@domain.com",
                Gender.MALE);

        JSONReportStrategy reportStrategy = new JSONReportStrategy();

        String testReport = reportStrategy.generateReport(customer);

        System.out.println(testReport);
    }
}
