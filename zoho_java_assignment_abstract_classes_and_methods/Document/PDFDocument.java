public class PDFDocument extends Document{
    
    PDFDocument(double size) {
        super(size);
    }
    
    public void viewer() {
        System.out.println("Adobe PDF viewer");
    }

    public double getSize() {
        return this.size;
    }
}
