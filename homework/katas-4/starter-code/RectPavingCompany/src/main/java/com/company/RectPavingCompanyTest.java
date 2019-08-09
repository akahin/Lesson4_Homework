package com.company;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import static org.junit.Assert.*;

public class RectPavingCompanyTest {



    @Test
    public void testgetCosts(){
        RectPavingCompany newPavment = new RectPavingCompany();
        float displayName = newPavment.getCosts(12.00f, 10.00f);
        assertEquals("12.00, 10.00", displayName);
    }
}
