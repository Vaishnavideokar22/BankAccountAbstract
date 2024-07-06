abstract class BankAccount{
    abstract void deposit();
    abstract void withdraw();
}
class Savings extends BankAccount{
    void deposit(){
      System.out.println("You can deposit cash in the BankAccount");  
    }
    void withdraw(){
        System.out.println("You can withdraw cash from BankAccount");
    }
}
class CurrentAccount extends BankAccount{
    void deposit(){
        System.out.println("You can deposit the cash from CurrentAccount");
    }
    void withdraw(){
        System.out.println("You can withdraw your cash From CurrentAccount");
    }

}
public class BankAccountAbstract {
    public static void main(String[] args) {

        Savings s1 = new Savings();
        s1.deposit();
        s1.withdraw();

        CurrentAccount c1 = new CurrentAccount();
        c1.deposit();
        c1.withdraw();


    }
    
}
