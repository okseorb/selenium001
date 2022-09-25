package smokeTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG1 {

    @Parameters("db")
    @Test (groups ={"smokeTest", "regress"})
    public void test1(String db) {
        System.out.println("Test 1, parametr is: " + db);
    }
    @Test (groups ={"regress"})
    public void test11() {
        System.out.println("Test 11");
    }
    @Test (groups ={"regress"})
    public void test111() {
        System.out.println("Test 111");
    }




}
