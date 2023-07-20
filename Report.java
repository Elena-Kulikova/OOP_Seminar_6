import java.util.Arrays;

public class Report {
    private byte[] data;

    public Report(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // Выводим отчет
        return "Report [data=" + Arrays.toString(data) + "]";
    }
}