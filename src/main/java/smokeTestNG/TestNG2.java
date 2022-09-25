package smokeTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG2 {

    //Группы тестов
    @Test(groups = {"smokeTest", "regress"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = {"smokeTest"})
    public void test22() {
        System.out.println("Test 22");
    }

    // Провайдер - для подстановки данных в тесты (массив массивов)
    @DataProvider(name = "dp")
    public static Object[][] dbData() {
        return new Object[][]{
                {"SQL", new Integer(1)},
                {"NOSQL", new Integer(2)}
        };
    }

    // Использование в тесте данных из Провайдера данных
    @Parameters({"dp"})
    @Test(dataProvider = "dp", groups = {"smokeTest", "regress"})
    public void test222(String e1, int e2) {
        System.out.println("Test 222 |" + " Параметр через DataProvider e1: " + e1 + " и e2: " + e2);
    }


    //    Зависимости в тестах: если в этом тесте-методе ошибка, то зависимый тест (test301) не выполняется
    @Test(groups = {"smokeTest", "regress"})
    public void test3(){
        Integer nn = 0;
        System.out.println("Direct test 3  !!!" + " " + 1/nn);
    }
    // Зависимый тест
    @Test(dependsOnMethods = {"test3"}, groups = {"smokeTest", "regress"})
    public void test301(){
        System.out.println("It is test301 - dependent test from test3.");
    }

       // Тест может зависеть сразу от группы тестов: выполняется, если вся группа проходит тест
    @Test(dependsOnGroups = {"smokeTest.*"}, groups = {"smokeTest", "regress"})
    public void test311(){
        System.out.println("It is test311 - dependent test from group  'smokeTest.*'  ");
    }



    // Зависимый тест, но с нежестким условием: alwaysRun = true
    @Test(dependsOnMethods = {"test3"}, alwaysRun = true, groups = {"smokeTest", "regress"})
    public void test302(){
        System.out.println("It is test302 - dependent test from test3 with 'alwaysRun = true' ");
    }




}
