public class Main {
    public static void main(String[] args) {
        Document pdf = new PDFDocument(2.4);
        Document text = new TextDocument(0.2);
        Document image = new ImageDocument(6.6);

        pdf.viewer();
        System.out.println("Size " + pdf.getSize() + "MB");
        text.viewer();
        System.out.println("Size " + text.getSize() + "MB");
        image.viewer();
        System.out.println("Size " + image.getSize() + "MB");

    }
}
