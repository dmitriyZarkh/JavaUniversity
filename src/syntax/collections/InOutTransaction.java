package syntax.collections;

public class InOutTransaction {
    //
    private String guid;
    private String type;
    // type - PROCESSING, CANCELED, DONE

    //


    public String getGuid() {
        return guid;
    }

    public String getType() {
        return type;
    }

    public InOutTransaction(String guid, String type) {
        this.guid = guid;
        this.type = type;
    }
}
