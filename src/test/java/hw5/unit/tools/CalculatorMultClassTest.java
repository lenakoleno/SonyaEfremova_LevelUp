package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "multLongData", dataProviderClass = DataProviderCalculator.class)
    public void multLongTest(long a, long b, long expectedResult) {
        long actualmult = calculator.mult(a, b);
        Assert.assertEquals(actualmult, expectedResult, "Incorrect result");
    }

    @Test(dataProvider = "multDoubleData", dataProviderClass = DataProviderCalculator.class)
    public void multDoubleTest(double a, double b, double expectedResult) {
        double actualmult = calculator.mult(a, b);
        Assert.assertEquals(actualmult, expectedResult, "Incorrect result");
    }
}
