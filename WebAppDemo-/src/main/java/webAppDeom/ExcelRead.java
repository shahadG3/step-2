package webAppDeom;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.junit.Test;
public class ExcelRead {


	@Test
	public static void main (String [] args) throws IOException {
		//Path of the excel file

		FileInputStream inputstream = new FileInputStream("D:\\shad\\step2\\Step Two Project\\The Test Data.xlsx");
		//Creating a workbook

		     try (XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
				XSSFSheet sheet = workbook.getSheetAt(0);
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(0);
				System.out.println(sheet.getRow(0).getCell(0));
				row = sheet.getRow(1);
				System.out.println(sheet.getRow(1).getCell(0));
				row = sheet.getRow(1);
				System.out.println(sheet.getRow(2).getCell(0));
				row = sheet.getRow(1);
				System.out.println(sheet.getRow(3).getCell(0));
				row = sheet.getRow(2);
				System.out.println(sheet.getRow(4).getCell(0));
				row = sheet.getRow(2);
				System.out.println(sheet.getRow(5).getCell(0));
				//Row row6 = sheet.getRow(2);
				//Cell cell6 = row.getCell(0);
				//System.out.println(sheet.getRow(6).getCell(0));
				String cellval = cell.getStringCellValue();
				System.out.println(cellval);
			} 

			System.out.println("Read File Done");
		
	}
}