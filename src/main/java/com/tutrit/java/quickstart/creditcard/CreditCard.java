package com.tutrit.java.quickstart.creditcard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard {
    private int numberOfCard;
    private int pinCod;
    private int balance;
    private int creditLimit;
    private int loanDept;

    Logger log = LoggerFactory.getLogger("CreditCard");

    public CreditCard(int num, int pin) {
        this.numberOfCard = num;
        this.pinCod = pin;
        balance = 0;
        loanDept = 0;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void deposit(int pinC, int a) {
        if (pinC != pinCod)
            log.error("Your pin-code is incorrect, please try again.");
        else if (loanDept != 0){
            if ((loanDept - a) <= 0){
                int e = loanDept - a;
                loanDept = 0;
                balance = balance - e;
            } else loanDept = loanDept - a;
        }
        else if (loanDept == 0) {
            balance = balance + a;
        }
    }

    public void withDraw(int pinC, int a) {
        if (pinC != pinCod)
            log.error("Your pin-code is incorrect, please try again");
        else if ((balance - a) >= 0)
            balance = balance - a;
        else if ((creditLimit + balance - a) >= 0 && (balance - a) < 0){
            int d = balance - a;
            loanDept = loanDept - d;
            balance = 0;
        }
        else if ((balance - a) < 0 && (creditLimit + balance - a) < 0) {
            log.error("Your loan dept is exceeds credit limit");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberOfCard=" + numberOfCard +
                ", pinCod=" + pinCod +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDept=" + loanDept +
                '}';
    }
}
