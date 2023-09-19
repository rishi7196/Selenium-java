package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	
	public String getExcelData(String sheetname , int rownum ,int cellNum) {
		String retval=null;
		
		try {
			FileInputStream fis= new FileInputStream("D:\\Software1\\jars\\poi_jars\\data.xlsx");
			
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s= wb.getSheet("login");
			
			Row r=s.getRow(rownum);			
			Cell c=r.getCell(cellNum);
			retval =c.getStringCellValue();
			//System.out.println(st);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;
		
		
		
	}

}
