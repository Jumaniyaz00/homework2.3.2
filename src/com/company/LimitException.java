package com.company;

public class LimitException extends Throwable {
    public String message;
    public double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

   public double remainingAmount(){
        return  remainingAmount;
   }
}