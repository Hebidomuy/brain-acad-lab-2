package Lab20;

public class BinaryData extends AbstractData implements Storable<byte[]> {

    StringData.Type BIN;
    byte[] data;

    public BinaryData(long id, StringData.Type BIN, byte[] data) {
        super(id);
        this.BIN = BIN;
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public byte[] read() {
        return data;
    }

    @Override
    public void write(byte[] data) {
        this.data = data;
    }

    @Override
    public StringData.Type getType() {
        return null;
    }

    @Override
    public String convertToString() {
        return new String(data);
    }
}
