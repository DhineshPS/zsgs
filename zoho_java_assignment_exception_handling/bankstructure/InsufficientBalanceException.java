public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super("Debit amount is greater than the available balance!");
    }
}
