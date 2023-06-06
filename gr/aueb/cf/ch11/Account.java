package gr.aueb.cf.ch11;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {}

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Deposits a certain amount
     * @param amount    the amount of money to be deposited
     * @throws Exception    if the amount is negative
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount exception");
            }
            balance += amount;

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * withdraws an amount of money from account
     * @param amount        the amount to be withdrawn
     * @param ssn           the given ssn
     *
     * @throws Exception    if the amount is greater than balance
     *                      if ssn is not valid
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn not valid exception");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance exception");
            }

            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * returns the balance of the account
     * @return  the accounts balance
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * returns the account state in string format
     * @return  the string represantation of the state of the account
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
