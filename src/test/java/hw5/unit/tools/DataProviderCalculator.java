package hw5.unit.tools;

import org.testng.annotations.DataProvider;

public class DataProviderCalculator {

    @DataProvider(name = "CosData")
    public static Object[][] cosData() {
        return new Object[][] {
            {0, 0},
            {60, -0.3048106211022167},
            {360, 0.9589157234143065},
        };
    }

    @DataProvider(name = "CtgData")
    //в калькуляторе стоит функция return Math.tanh(a) для нахождения ctg, не нашла такой функции в интернете
    public static Object[][] ctgData() {
        return new Object[][] {
            {30, 1},
            {45, 1},
        };
    }

    @DataProvider(name = "divLongData")
    public static Object[][] divLongData() {
        return new Object[][] {
            {2L, 2L, 1L},
            {10L, 2, 5L},
            {9, 3, 3},
        };
    }

    @DataProvider(name = "divDoubleData")
    public static Object[][] divDoubleData() {
        return new Object[][] {
            {1.2, 1.2, 1},
            {4.0, 2.0, 2},
            {12.2, 6.1, 2.0}
        };
    }

    @DataProvider(name = "PositiveData")
    public static Object[][] positiveData() {
        return new Object[][] {
            {2, true},
            {-2, false},
            {0, false},
        };
    }

    @DataProvider(name = "NegativeData")
    public static Object[][] negativeData() {
        return new Object[][] {
            {-3, true},
            {-4, true},
            {0, false},
        };
    }

    @DataProvider(name = "multLongData")
    public static Object[][] multLongData() {
        return new Object[][] {
            {3L, 3L, 9L},
            {2, 2, 4},
        };
    }

    @DataProvider(name = "multDoubleData")
    public static Object[][] multDoubleData() {
        return new Object[][] {
            {4.15, 4.15, 17.0},
            {1.6, 2.3, 3.0},
        };
    }

    @DataProvider(name = "powData")
    public static Object[][] powDoubleData() {
        return new Object[][] {
            {3, 2, 9},
            {-2, -5, -0.03125},
            {5.5, 0, 1},
        };
    }

    @DataProvider(name = "SinData")
    public static Object[][] sinData() {
        return new Object[][] {
            {0.0, 0.0000},
            {30.0, -0.9880316240928618},
            {45.0, 0.8509035245341184},
        };
    }

    @DataProvider(name = "SqrtData")
    public static Object[][] sqrtData() {
        return new Object[][] {
            {0.25, 0.5},
            {9, 3},
        };
    }

    @DataProvider(name = "subLongData")
    public static Object[][] subLongData() {
        return new Object[][] {
            {4L, 0, 4L},
            {-5, -5, 0},
        };
    }

    @DataProvider(name = "subDoubleData")
    public static Object[][] subDoubleData() {
        return new Object[][] {
            {3.1, 1.1, 2},
            {0, 7.4, -7.4},
        };
    }

    @DataProvider(name = "sumDoubleData")
    public static Object[][] sumDoubleData() {
        return new Object[][] {
            {69.69, 69.69, 139.38},
            {-30.20, -9.99, -40.19},
        };
    }

    @DataProvider(name = "sumLongData")
    public static Object[][] sumLongData() {
        return new Object[][] {
            {33333333L, 0, 33333333L},
            {12345, 12345, 24690},
        };
    }

    @DataProvider(name = "TgData")
    public static Object[][] tgData() {
        return new Object[][] {
            {45, 1},
            {30, 1}
        };
    }
}
