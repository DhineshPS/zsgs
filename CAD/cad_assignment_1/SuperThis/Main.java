public class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child(3);
        Parent parent1 = new Parent();
        Parent parent2 = new Parent(8);

        System.out.println(child1.getNum());
        System.out.println(child2.getNum());
        System.out.println(parent1.getNum());
        System.out.println(parent2.getNum());
    }
}
