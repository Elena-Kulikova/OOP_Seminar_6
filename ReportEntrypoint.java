public class ReportEntrypoint {

    public Report create(Document document, Action reportType) {
        return new Report(reportType.convert(document));
    }
   
}