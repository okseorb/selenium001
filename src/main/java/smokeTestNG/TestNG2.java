package smokeTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG2 {

    @Test(groups = {"smokeTest", "regress"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = {"smokeTest"})
    public void test22() {
        System.out.println("Test 22");
    }


    @DataProvider(name = "dp")
    public static Object[][] dbData() {
        return new Object[][]{
                {"SQL", new Integer(1)},
                {"NOSQL", new Integer(2)}
        };
    }

    @Parameters({"dp"})
    @Test(dataProvider = "dp", groups = {"smokeTest", "regress"})
    public void test222(String e1, int e2) {
        System.out.println("Test 222 |" + " Параметр через DataProvider e1: " + e1 + " и e2: " + e2);
    }


}
