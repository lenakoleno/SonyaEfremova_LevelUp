package hw5.unit.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTgClassTest extends AbstractBaseCalculatorClass {
    @Test(dataProvider = "TgData", dataProviderClass = DataProviderCalculator.class)
    public void tgTest(double a, double expectedResult) {
        double actualResult = calculator.tg(a);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }
}
