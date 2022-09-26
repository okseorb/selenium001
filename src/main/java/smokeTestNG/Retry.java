package smokeTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//  Создаем такой класс | Повторный запуск теста, если он упал
public class Retry implements IRetryAnalyzer {
        private int actualRetry = 0;
        private static final int MAX_RETRY = 3;

        // Переопределяем метод | Повторный запуск теста, если он упал

        public boolean retry(ITestResult result) {

            if (actualRetry < MAX_RETRY) {
                actualRetry++;
                return true;
            } else {
                return false;
            }
        }
}
