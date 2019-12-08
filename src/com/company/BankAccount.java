package com.company;



public class BankAccount{

   public   double amount;

    public double getAmount() {
        return amount;
    }

    public  double deposit(double sum){
        amount= amount + sum;
        System.out.println("  ваш счет "+ amount);
        return amount;
    }
   public  void  withDraw(double sum) throws  LimitException {
        amount = amount - sum;
       System.out.println("  ваш счет после операчи "+ amount);
       if (sum> getAmount() ) {
           throw new LimitException(" сообщение об ошибке анан счеттун остатогу   ", 88998);
       }
    }
}
