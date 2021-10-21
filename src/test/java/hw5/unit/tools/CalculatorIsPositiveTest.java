package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends AbstractBaseCalculatorClass {

    @Test(dataProvider = "PositiveData", dataProviderClass = DataProviderCalculator.class)
    public void isPositieTest(long a, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(a);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
