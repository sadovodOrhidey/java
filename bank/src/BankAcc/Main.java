package  BankAcc;

public class Main {
    public static void main(String[] args) {
        try {
            DepositAccount numb1 = new DepositAccount();
            BankAccount numb2 = new BankAccount();
            CardAccount numb3 = new CardAccount();
            numb1.moneyIn(100);
            numb2.moneyIn(100);
            numb3.moneyIn(100);

            numb1.moneyOut(100);
            numb2.moneyOut(100);
            numb3.moneyOut(100);
            String result = numb1.getPayDate();
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Арифметическая ошибка.");
        }
    }
    }
