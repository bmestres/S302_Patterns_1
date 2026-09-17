import tools.jackson.dataformat.xml.XmlMapper;

public class XMLReportStrategy implements ReportStrategy {
    private static final String DISPLAY_NAME = "XML Report:";

    @Override
    public String generateReport(Customer customer) {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(customer);
        if(customer == null) {
            throw new NullPointerException();
        }
        return xml;
    }


    static void main(String[] args) {

        Customer customer = new Customer(
                1,
                "Customer name",
                "Customer surname",
                "email@domain.com",
                Gender.MALE);

        ReportStrategy xmlReport = new XMLReportStrategy();
        
        System.out.println(xmlReport.generateReport(customer));

    }
}
