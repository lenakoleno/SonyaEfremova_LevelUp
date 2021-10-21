package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSubClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "subLongData", dataProviderClass = DataProviderCalculator.class)
    public void subLongTest(long a, long b, long expectedResult) {
        long actualSum = calculator.sub(a, b);
        Assert.assertEquals(actualSum, expectedResult, "Incorrect result");
    }

    @Test(dataProvider = "subDoubleData", dataProviderClass = DataProviderCalculator.class)
    public void subDoubleTest(double a, double b, double expectedResult) {
        double actualSum = calculator.sub(a, b);
        Assert.assertEquals(actualSum, expectedResult, "Incorrect result");
    }
}
