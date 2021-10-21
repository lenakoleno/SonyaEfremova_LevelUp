package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSqrtClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "SqrtData", dataProviderClass = DataProviderCalculator.class)
    public void sqrtTest(double a, double expectedResult) {
        double actualResult = calculator.sqrt(a);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
