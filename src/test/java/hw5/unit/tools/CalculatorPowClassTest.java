package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPowClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "powData", dataProviderClass = DataProviderCalculator.class)
    public void powTest(double a, double b, double expectedResult) {
        double actualResult = calculator.pow(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
