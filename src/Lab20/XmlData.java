package Lab20;

public class XmlData extends AbstractData implements Storable<String> {

    private final StringData.Type XML;
    private String data;

    public XmlData(long id, StringData.Type XML, String data) {
        super(id);
        this.XML = XML;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }

    @Override
    public StringData.Type getType() {
        return null;
    }

    @Override
    public String convertToString() {
        return data;
    }

}
