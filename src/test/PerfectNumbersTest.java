package test;

import main.PerfectNumbers;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class PerfectNumbersTest {

    @Test
    public void aNumberThatIsAPerfectNoTest() {
        int knownPerfectNumber = 6;
        boolean result = PerfectNumbers.isPerfectNumber(knownPerfectNumber);
        Assert.assertTrue("Given Number is not a perfect number", result);
    }

    @Test
    public void aNumberThatIsNotAPerfectNoTest() {
        int knownNonPerfectNumber = 5;
        boolean result = PerfectNumbers.isPerfectNumber(knownNonPerfectNumber);
        Assert.assertFalse("Given Number is a perfect number", result);
    }

    @Test
    public void aNegativeNumberIsNotAPerfectNoTest() {
        int number = -6;
        boolean result = PerfectNumbers.isPerfectNumber(number);
        Assert.assertFalse("Given Number is a perfect number", result);
    }

    @Test
    public void findPerfectNumberInGivenRangeTest() {

        PerfectNumbers.startingNumber = 1;
        PerfectNumbers.endingNumber = 30;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(28);

        ArrayList<Integer> actual = PerfectNumbers.validatePerfectNumber(PerfectNumbers.startingNumber, PerfectNumbers.endingNumber);
        Assert.assertEquals(actual,expected);
    }
}
