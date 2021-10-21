package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSinClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "SinData", dataProviderClass = DataProviderCalculator.class)
    public void sinTest(double a, double expectedResult) {
        double actualResult = calculator.sin(a);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
