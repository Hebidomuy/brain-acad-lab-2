package Lab20;

public class DocumentProcessorUtil<T extends AbstractData> {
    static int ID_COUNTER = 0;

    private DocumentProcessorUtil() {
    }

    public static <T extends AbstractData & Storable> StringData<T> convert(T data) {
        return new StringData<>(ID_COUNTER++, data.getType(), data);
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }

}

