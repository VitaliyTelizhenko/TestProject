package org.example.firstClasss;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    private static final int VALID_AMOUNT = 5;
    private static final String VALID_CURRENCY = "RUB";

    private static final Object[] getInvalidAmount(){
        return new Integer [][] {{-1234}, {-5}, {-89}};
    }
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidAmount")
    public void testInvalidAmount(int amount){
        new Money(amount, VALID_CURRENCY);
    }


    private static final Object[] getInvalidCurrency(){
        return new String [][] {{null}, {""}};
    }
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void testInvalidCurrency(String currency){
        new Money(VALID_AMOUNT, currency);
    }

    private static final Object[] getMoney(){
        return new Object[] {
           new Object[] {10, "USD"},
           new Object[] {20, "EUR"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void testConstructor(int amount, String currency){
        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
}