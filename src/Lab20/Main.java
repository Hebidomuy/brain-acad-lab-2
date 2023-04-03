package Lab20;

public class Main {
    public static void main(String[] args) {
        long id = DocumentProcessorUtil.ID_COUNTER;
        XmlData xmlData = new XmlData(id, StringData.Type.XML, " <?xml version=\"1.0\"?><Tests>qwerty</Tests>");
        BinaryData binaryData = new BinaryData(id, StringData.Type.BIN, "Данные в байтах".getBytes());
        NumericData numericData = new NumericData(id, StringData.Type.NUM, 123.456789);

        DocumentProcessorUtil.build(xmlData, xmlData.getData());
        DocumentProcessorUtil.build(binaryData, binaryData.getData());
        DocumentProcessorUtil.build(numericData, numericData.getData());

        StringData xmlStringData = DocumentProcessorUtil.convert(xmlData);
        StringData binaryStringData = DocumentProcessorUtil.convert(binaryData);
        StringData numericStringData = DocumentProcessorUtil.convert(numericData);

        System.out.println(xmlStringData.getData());
        System.out.println(binaryStringData.getData());
        System.out.println(numericStringData.getData());
    }
}

