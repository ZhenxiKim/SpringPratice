package com.example.springpratice;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author jhkim
 * @since 2022-07-31
 */
public class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨() {
        LocalDate billingDate = LocalDate.of(2019, 3,1);
        int payAmount = 10_000;

        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);
        System.out.println("expiryDate = " + expiryDate);

        assertEquals(LocalDate.of(2019,4,1), expiryDate);
    }
}
