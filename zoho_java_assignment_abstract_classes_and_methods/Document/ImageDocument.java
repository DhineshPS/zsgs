public class ImageDocument extends Document{
    ImageDocument(double size) {
        super(size);
    }
    
    public void viewer() {
        System.out.println("Photoshop");
    }

    public double getSize() {
        return this.size;
    }
}
