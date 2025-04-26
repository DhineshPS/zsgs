public class Parent {
    private int num1;

    Parent() {
        this(1);
    }

    Parent(int num1) {
        this.num1 = num1;
    }

    public int getNum() {
        return this.num1;
    }
}
