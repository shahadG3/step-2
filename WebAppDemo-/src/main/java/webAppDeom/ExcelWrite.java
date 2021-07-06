package webAppDeom;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
public class ExcelWrite {

	@Test
	public static void main(String[] args) throws IOException {
		FileInputStream inputstream = new FileInputStream("D:\\shad\\step2\\Step Two Project\\The Test Data.xlsx");

		try (Workbook workbook = new XSSFWorkbook(inputstream)) {
			Sheet sheet1 = workbook.getSheetAt(0);
			int lastRow = sheet1.getLastRowNum();
			for(int i=0; i<=lastRow; i++){
				Row row = sheet1.getRow(i);
				Cell cell = row.createCell(1);

				cell.setCellValue("Write into Excel");

			}

			FileOutputStream fos = new FileOutputStream("D:\\shad\\step2\\Step Two Project\\The Test Data.xlsx");
			workbook.write(fos);
			System.out.println("Write into Excel DONE !!");
			fos.close();
		}
	}
}


