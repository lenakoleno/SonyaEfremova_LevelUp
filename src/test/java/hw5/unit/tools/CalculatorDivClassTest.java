package hw5.unit.tools;

import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;

public class CalculatorDivClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "divLongData", dataProviderClass = DataProviderCalculator.class)
    public void divLongTest(long a, long b, long expectedResult) {
        long actualdiv = calculator.div(a, b);
        Assert.assertEquals(actualdiv, expectedResult, "Incorrect result");
    }

    @Test(dataProvider = "divDoubleData", dataProviderClass = DataProviderCalculator.class)
    public void divDoubleTest(double a, double b, double expectedResult) {
        double actualdiv = calculator.div(a, b);
        Assert.assertEquals(actualdiv, expectedResult, "Incorrect result");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divLongZeroTest() {
        long actualdiv = calculator.div(16, 0);
        Assert.assertEquals(actualdiv, IExpectedExceptionsHolder.class, "Incorrect result");
    }
}
