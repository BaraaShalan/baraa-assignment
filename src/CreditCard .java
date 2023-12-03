
    public class CreditCard {
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        private double creditLimit;


        public void makePayment(double amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("Payment amount cannot be negative");
            }
            if (balance - amount < 0) {
                //throw new InsufficientFundsException("Insufficient funds to cover payment");
            }
            balance -= amount;
        }


    }

