package BankAcc;

public class BankAccount {

    protected float money = 0.00f;

    public void moneyIn(float money) {
        if (money >= 0){
            this.money += money;
        }
    }

    public void moneyOut(float money){
        if (money <= this.money){
            this.money -= money;
        }

    }

    public String getMoneyInfo(){
        return "Баланс составляет:" + money + "руб.";
    }
}
