public class Bank {
    private String bankName;
    private int numOfCustomer = 0;
    private Customer[] customers = new Customer[5];

    //Bank constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    //Add Costumer XD
    public void addCustomer(String firstName, String lastName) {
        if (numOfCustomer == customers.length-1) {
            //Add the size of array if it reaches its limit.
            Customer[] temp = new Customer[customers.length*2];
            for (int i = 0; i <= numOfCustomer; i++) {
                temp[i] = customers[i];
            }
            customers = temp;
        }
        customers[numOfCustomer] = new Customer(firstName, lastName);
        numOfCustomer += 1;
    }

    //Get Number Of Constructor
    public int getNumOfCustomer() {
        return this.numOfCustomer;
    }

    //Get Customer
    public Customer getCustomers(int index) {
        if (index > numOfCustomer) {
            //Print out out of index if the index is more than the number of customer
            System.out.print("\nOut of index!\t\t\t");
            return new Customer("", "");
        }
        return customers[index];
    }
}
