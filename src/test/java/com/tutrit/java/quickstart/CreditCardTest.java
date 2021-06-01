package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.creditcard.CreditCard;
import org.junit.Test;


public class CreditCardTest {


    @Test
    public void CardMain() {
        CreditCard testCard = new CreditCard(12345,1234);
        testCard.setCreditLimit(200);

        testCard.deposit(1234, 500);
        testCard.withDraw(1234,700);
        testCard.deposit(1234, 100);

        testCard.withDraw(125,200);
        testCard.deposit(145, 9500);


    }

}
