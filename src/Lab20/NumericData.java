package Lab20;

public class NumericData extends AbstractData implements Storable<Number> {

    StringData.Type NUM;
    Number data;

    public NumericData(long id, StringData.Type NUM, Number data) {
        super(id);
        this.NUM = NUM;
        this.data = data;
    }

    public Number getData() {
        return data;
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        this.data = data;
    }

    @Override
    public StringData.Type getType() {
        return null;
    }

    @Override
    public String convertToString() {
        return data.toString();
    }
}
