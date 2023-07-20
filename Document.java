import java.util.UUID;

public class Document {

    private UUID id;
    private String number;
    private String text;
    private String type;

    public Document(String number, String text) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }
}