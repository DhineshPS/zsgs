package zoho_task2_1;

public class Hello_World {
    public static void main(String[] args) {
        System.out.println(hello_world_print());
        
    }
    // static method is used as it cannot be called from main method due to main method itself is static
    // non-static methods cannot be called by static context
    static String hello_world_print() {
        return "Hello World";
    }
}
