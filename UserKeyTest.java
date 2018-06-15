public class UserKeyTest{
    public static void main(String[] args) {
        UserKey b1 = new Userkey("Bill Smith", "BSMITH");
        UserKey b2 = new Userkey("Bill Smith", "BSMITH");
        UserKey b3 = new Userkey("Susan Smith", "SSMITH");
        UserKey b4 = new Userkey(null, null);

        System.out.println( b1.equals(b1) );  // prints true
        System.out.println( b1.equals(b2) );  // prints true
        System.out.println( b1.equals(b3) );  // prints false
        System.out.println( b1.equals(null) ); // prints false
        // System.out.println( b1.equals(“Some String”) ); // prints false
        System.out.println( b4.equals(b1) ); // prints false



        System.out.println("Bank Account 1: ");
        System.out.println("id: " + myBank.accountNum);
        System.out.println("Checking: " + myBank.checking);
        System.out.println("Saving: " + myBank.saving);
        myBank.deposit(1, 99999);
        myBank.withdraw(1, 1000);
        myBank.withdraw(2, 100000);
        System.out.println("The total in your account is: " + myBank.totalInAccount());

        System.out.println(BA.numAccounts);
        System.out.println("Total in all accounts is: " + BA.total);
        
    
    }
}