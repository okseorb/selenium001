import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RubenTables49 {

    private WebElement tableElement;
    private WebDriver driver;



    public RubenTables49(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    //Метод для получения всех строк с данными в таблице (без заголовков)
    public List<WebElement> getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        //Удаляем первую строку - заголовки
        rows.remove(0);
        return rows;
    }
    //Метод для получения списка заголовков
    public List<WebElement> getHeadings() {
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headdingColumn = headingsRow.findElements(By.xpath(".//th"));
        return headdingColumn;
    }
    //Разбиваем строки данных таблицы на колонки - забираем список списка с колонками
    public List<List<WebElement>> getRowsWithColumns(){
        //Получаем все строки данных таблицы
        List<WebElement> rows = getRows();
        //Создаем лист листов вебэлементов
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        //Проходим по всем строкам данных таблицы и каждую строку разбиваем на столбцы
        for (WebElement row : rows){
            //Для каждой строки записываем список столбцов в переменную rowWithColumns типа Список Вебэлементов
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));
            //Записываем строки списка столбцов в массив из части с данными таблицы (без заголовков)
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
        }

        //Метод получения элемента части таблицы с данными (исключая заголовки) по его координатам
        public String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        WebElement cell = rowsWithColumns.get(rowNumber-1).get(columnNumber-1);
        return cell.getText();
        }

        public String getValueFromCell(int rowNumber, String columnName){
        List<Map<String, WebElement>> RowsWithColumnsByHeadings = getRowsWithColumnsByHeadings();
            return RowsWithColumnsByHeadings.get(rowNumber-1).get(columnName).getText();
        }



        // Метод для получения значения (табличная часть без заголовков) по номеру строки и заголовку колонки
    //List - список строк, содержащий строки Map - список ключей-значений, содержащий: названия столбцов и соответствующие ячейки этого столбца
    public List<Map<String, WebElement>> getRowsWithColumnsByHeadings(){
        //забираем список строк со списком колонок (список строк, разбитых на заголовки) из таблицы (часть без заголовков)
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        //Искомое
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = new ArrayList<Map<String, WebElement>>();
        Map<String, WebElement> rowByHeadings;
        //Получим список заголовков таблицы
        List<WebElement> headingColumns = getHeadings();

        // перебираем строки данных
        for (List<WebElement> row : rowsWithColumns){
            // создаем новый Map
            rowByHeadings = new HashMap<String, WebElement>();


            // перебираем заголовки
            for (int i = 0; i< headingColumns.size(); i++){
                String heading = headingColumns.get(i).getText();
                WebElement cell = row.get(i);
                rowByHeadings.put(heading, cell);
            }
            rowsWithColumnsByHeadings.add(rowByHeadings);
        }
        return rowsWithColumnsByHeadings;

    }











}
