public class AccountTest {
    //Property Data Bank
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.name = "123456789";
        account1.balance = 1000.0;
        account1.interestRate = 0.05;
        account1.cetak();

        SavingAccount account2 = new SavingAccount();
        account2.name = "987654321";
        account2.balance = 19000.0;
        account2.cetak();

        SavingAccount account3 = new SavingAccount();
        account3.name = "456789123";
        account2.balance = 6000.0;
        account3.cetak();
        
    }
    
}
