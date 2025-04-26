package state.sb;

public class StatesAndBehaviors {
    int defaultNum = 4;
    public int publicNum = 4;
    private int privateNum = 4; 
    protected int protectedNum = 4;

    void printDefault() {
        System.out.println(defaultNum);
    }

    public void printPublic() {
        System.out.println(publicNum);
    }

    private void printPrivate() {
        System.out.println(privateNum);
    }

    protected void printProtectedd() {
        System.out.println(protectedNum);
    }
}
