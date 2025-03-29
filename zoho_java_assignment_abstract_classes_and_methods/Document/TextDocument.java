public class TextDocument extends Document{
    TextDocument(double size) {
        super(size);
    }
    
    public void viewer() {
        System.out.println("Visual Studio Code");
    }

    public double getSize() {
        return this.size;
    }
}
