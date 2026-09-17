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
        
        return String.format("%s\n%s", DISPLAY_NAME, xml);
    }
}
