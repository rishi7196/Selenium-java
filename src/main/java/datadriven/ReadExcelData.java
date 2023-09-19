package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void main(String[] args) throws IOException {
		
		File fil= new File("resources\\data.xlsx");
		FileInputStream fis= new FileInputStream(fil);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		
		//one methid is there getPysicalNumber ofRow
		int rowCount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			XSSFRow rows=sheet.getRow(i);
			
			int cellcount=rows.getPhysicalNumberOfCells();
			
			for(int j=0;j<cellcount;j++)
			{
				XSSFCell cell=rows.getCell(j);
				
				String cellValue=getCellvalue(cell);
				System.out.print(" || "+cellValue);
				
			}
			System.out.println();
		}
	}
		
		public static String getCellvalue(XSSFCell cell)
		{
			switch (cell.getCellType()) {
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
				
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return String.valueOf(cell.getStringCellValue());				

			default:
				return cell.getStringCellValue();
			}
		}
		
		
		
		
	}


