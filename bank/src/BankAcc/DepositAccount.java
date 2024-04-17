package BankAcc;

import java.time.LocalDate;

public class DepositAccount extends BankAccount{

    private LocalDate lastIncome;
    private LocalDate unlock_date;
    private boolean condition = true;

    public String getPayDate(){
        return "Дата внесения последнего платежа:" + lastIncome + ".";
    }

    public void moneyOut(float money){
        if (unlock_date.isBefore(LocalDate.now())) {
            this.money -= money;
        }
    }

    public String getCondition(){
        if (condition){
           return "Можно снять сумму.";
        }

        return "Счет заблокирован, дождитесь разбблокировки.";
    }

    public void moneyIn(float money){
        this.money += money;
        condition = false;
        lastIncome = LocalDate.now();
        unlock_date = lastIncome.plusMonths(1);
    }

}
