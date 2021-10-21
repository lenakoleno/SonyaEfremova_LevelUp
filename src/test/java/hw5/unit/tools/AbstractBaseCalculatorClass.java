package hw5.unit.tools;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.levelup.qa.at.calculator.Calculator;

public abstract class AbstractBaseCalculatorClass {

    protected Calculator calculator;

    @BeforeMethod
    public void beforeTestMethod() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterTestMethod() {
        calculator = null;
    }
}
