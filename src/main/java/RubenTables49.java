import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RubenTables49 {

    private WebElement tableElement;
    private WebDriver driver;



    public RubenTables49(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    //Метод для получения всех строк в таблице
    public List<WebElement> getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        //Удаляем первую строку - заголовки
        rows.remove(0);
        return rows;
    }
    //Метод для получения списка заголовков
    public List<WebElement> getHeadings() {
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headdingColumn = headingsRow.findElements(By.xpath("//th"));
        return headdingColumn;
    }
    //Разбиваем строки на колонки - забираем список списка с колонками
    public List<List<WebElement>> getRowsWithColumns(){
        //Получаем все строки таблицы
        List<WebElement> rows = getRows();
        //Создаем лист листов вебэлементов
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        //Проходим по всем строкам таблицы и каждую строку разбиваем на столбцы
        for (WebElement row : rows){
            //Для каждой строки записываем список столбцов в переменную rowWithColumns типа Список Вебэлементов
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));
            //Записываем строки списка столбцов в массив
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
        }

        //Метод получения элемента таблицы по его координатам
        public String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        WebElement cell = rowsWithColumns.get(rowNumber-1).get(columnNumber-1);
        return cell.getText();
        }











}
