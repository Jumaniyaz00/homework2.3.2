package com.company;

import javax.naming.LimitExceededException;
import javax.naming.LinkLoopException ;

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
   public  void  withDraw(double sum) throws LimitException, LimitException {
        amount = amount - sum;
       System.out.println("  ваш счет после операчи "+ amount);
       if (sum> getAmount() ) {
           throw new LimitException("   ", 88998);
       }
    }
}
