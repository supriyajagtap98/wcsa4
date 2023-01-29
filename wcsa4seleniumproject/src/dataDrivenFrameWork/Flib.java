package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
public String readExcelData(String excelPath, String sheetName,int rowcount,int cellCount) throws EncryptedDocumentException, IOException
{
FileInputStream fis = new FileInputStream(excelPath);
Workbook wb = WorkbookFactory.create(fis);
Sheet sheet = wb.getSheet(sheetName);
Row row = sheet.getRow(rowcount);
Cell cell = row.getCell(cellCount);
String data = cell.getStringCellValue();
return data;
}
public void rowcount()
{
	FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
	wb=Workbook
}
}
