package Lab20;

public abstract class AbstractData {
    private long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract String convertToString();
}

