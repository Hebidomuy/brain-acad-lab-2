package Lab20;

public class StringData<T> extends AbstractData {
    private Type type;
    private String data;

    enum Type {XML, BIN, NUM}

    public StringData(long id) {
        super(id);
    }

    @Override
    public String convertToString() {
        return null;
    }

    public Type getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(DocumentProcessorUtil.ID_COUNTER);
        this.type = data.getType();
        this.data = data.convertToString();
    }
}
