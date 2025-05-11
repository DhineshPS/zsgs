public class Account {
    private double balance;
    private String pin;

    Account(String pin) {
        balance = 0;
        this.pin = pin;
    }

    public void creditToAccount(double creditAmount) {
        try {
            if(this.balance >= 1000000)
                throw new CreditLimitReachedException();
            this.balance += creditAmount;
        }
        catch(CreditLimitReachedException e) {
            System.out.println(e);
        }
    }

    public void debitToAccount(double debitAmount) {
        try {
            if(this.balance < debitAmount)
                throw new InsufficientBalanceException();
            this.balance -= debitAmount;
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void checkpin(String pin) throws WrongPinException {
            if(!this.pin.equals(pin))
                throw new WrongPinException();
    }
}
