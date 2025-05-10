public class CreditLimitReachedException extends Exception{
    CreditLimitReachedException() {
        super("You have exceeded the transaction limit for the current day!");
    }
}
