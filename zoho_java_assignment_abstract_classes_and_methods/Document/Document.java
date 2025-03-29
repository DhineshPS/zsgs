public abstract class Document {
    public double size;
    Document(double size) {
        this.size = size;
    }
    public abstract void viewer();
    public abstract double getSize();
}
