public class Main {
    public static void main(String[] args) {
        Bank bigBengBank = new Bank("BigBeng");

        System.out.println("number of customer (before) = " + bigBengBank.getNumOfCustomer());
        bigBengBank.addCustomer("A", "beng");
        bigBengBank.getCustomers(0).setAccount(new Account(-1));
        bigBengBank.addCustomer("I", "beng");
        bigBengBank.getCustomers(1).setAccount(new Account(1));
        bigBengBank.addCustomer("U", "beng");
        bigBengBank.getCustomers(2).setAccount(new Account(2));
        bigBengBank.addCustomer("E", "beng");
        bigBengBank.getCustomers(3).setAccount(new Account(3));
        bigBengBank.addCustomer("O", "beng");
        bigBengBank.addCustomer("A", "meng");
        System.out.println("number of customer (after) = " + bigBengBank.getNumOfCustomer());


        System.out.println(bigBengBank.getCustomers(0).getFirstName() + bigBengBank.getCustomers(0).getLastName() + " has $" + bigBengBank.getCustomers(0).getAccount().getBalance() + " in his bank.");
        System.out.println(bigBengBank.getCustomers(1).getFirstName() + bigBengBank.getCustomers(1).getLastName() + " has $" + bigBengBank.getCustomers(1).getAccount().getBalance() + " in his bank.");
        System.out.println(bigBengBank.getCustomers(2).getFirstName() + bigBengBank.getCustomers(2).getLastName() + " has $" + bigBengBank.getCustomers(2).getAccount().getBalance() + " in his bank.");
        System.out.println(bigBengBank.getCustomers(3).getFirstName() + bigBengBank.getCustomers(3).getLastName() + " has $" + bigBengBank.getCustomers(3).getAccount().getBalance() + " in his bank.");
        System.out.println(bigBengBank.getCustomers(4).getFirstName() + bigBengBank.getCustomers(4).getLastName() + " has $" + bigBengBank.getCustomers(4).getAccount().getBalance() + " in his bank.");
        System.out.println(bigBengBank.getCustomers(1000).getFirstName());
    }
}

/**Note:
 * The program is the same as the description of the map. It doesn't use catch-error so it is a bit mess.
 * Take set up account for example, if we don't return a null, an error will be thrown. If we set the account in the
 * constructor, set account will be useless.
 * **/
