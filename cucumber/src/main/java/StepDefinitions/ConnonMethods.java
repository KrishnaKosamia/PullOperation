package StepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConnonMethods {
	
	
	
	public static String getDataFromExcel(int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		Workbook create = WorkbookFactory.create(new FileInputStream("/Users/Krishna/eclipse-workspace/cucumber/src/test/resources/TestData/testdata.xlsx"));
		Cell cell2 = create.getSheet("Sheet1").getRow(row).getCell(cell);
		
		return cell2.toString();
		
		
		
		
		
		
	}
	public static void updateExistingFile(int index , int col,String [] data) throws EncryptedDocumentException, IOException {
		String path = "/Users/sourav/git/repository13/CucuFramework/src/test/java/Stepdefinitions/Testdata/testdata.xlsx";
		FileInputStream fi = new FileInputStream(path);
		
		Workbook create = WorkbookFactory.create(fi);
		Sheet sheet = create.getSheetAt(index);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		int rowvalue = lastRowNum + 1;
		System.out.println(rowvalue);
		
	
		for (String dataarg : data) {
			
			Row rows = sheet.createRow(rowvalue);
			Cell cell = rows.createCell(col);
			cell.setCellValue(dataarg);
			
			rowvalue++;
			
		}
		
		create.write(new FileOutputStream("/Users/sourav/git/repository13/CucuFramework/src/test/java/Stepdefinitions/Testdata/testdata.xlsx"));
		
		
		
		
	}
}
