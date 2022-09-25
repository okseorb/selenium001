package smokeTestNG;

import org.testng.annotations.Test;

public class TestNG2 {

    @Test (groups ={"smokeTest", "regress"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test (groups ={"smokeTest"})
    public void test22() {
        System.out.println("Test 22");
    }
}
