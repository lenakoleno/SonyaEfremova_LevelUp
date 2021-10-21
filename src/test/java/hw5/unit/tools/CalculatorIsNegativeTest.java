package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends AbstractBaseCalculatorClass {

    @Test(dataProvider = "NegativeData", dataProviderClass = DataProviderCalculator.class)
    public void isNegativeTest(long a, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(a);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
