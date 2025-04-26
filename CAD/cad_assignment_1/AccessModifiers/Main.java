import ext.extendedclass.ExtendedClass;
import state.sb.StatesAndBehaviors;

public class Main {
    public static void main(String[] args) {
        StatesAndBehaviors sb = new StatesAndBehaviors();
        ExtendedClass ec = new ExtendedClass();

        //System.out.println(sb.defaultNum);
        System.out.println(sb.publicNum);
        //System.out.println(sb.protectedNum);
        // System.out.println(sb.privateNum);

        //System.out.println(ec.defaultNum);
        System.out.println(ec.publicNum);
        //System.out.println(ec.protectedNum);
        // System.out.println(ec.privateNum);

        //sb.printDefault();
        sb.printPublic();
        //sb.printProtectedd();
        // sb.printPrivate();

        //ec.printDefault();
        ec.printPublic();
        //ec.printProtectedd();
        // ec.printPrivate();

    }
}
