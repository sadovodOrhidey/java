package BankAcc;

public class CardAccount extends BankAccount{

    public void moneyOut(float money){
        if (money  * 1.1 <= this.money)
        {
            this.money -= money  * 1.1;
        }
    }
}
