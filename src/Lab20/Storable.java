package Lab20;

public interface Storable<S> {
    S read();
    void write(S data);
    StringData.Type getType();
}
