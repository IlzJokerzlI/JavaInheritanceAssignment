public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    //Customer constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Get First Name
    public String getFirstName() {
        return this.firstName;
    }


    //Get Last Name
    public String getLastName() {
        return this.lastName;
    }

    //Get Account
    public Account getAccount() {
        if (account == null) {
            //If account has not been set up
            System.out.print("\nUser " + this.getFirstName() + this.getLastName() + " has no account! Please set an account first!\t\t\t");
            return new Account(0);
        }
        return this.account;
    }

    //Set Account
    public void setAccount(Account account) {
        this.account = account;
    }
}
