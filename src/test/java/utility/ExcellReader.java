package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {

	static FileInputStream fis = null;

	public FileInputStream getFileInputStream() {
		String filePath = System.getProperty("user.dir") +"\\Excel\\Testdata.xlsx";
		File srcFile = new File(filePath);

		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found. treminating Process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis;
	}

	public String[][] getExcelData() throws IOException {
		fis = getFileInputStream();
		//creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		  //creating a Sheet object
		XSSFSheet sheet = wb.getSheetAt(0);

		int TotalNumberOfRows = (sheet.getLastRowNum()+1);
		int TotalNumberOfCols = 1;

		String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];

		for (int i = 0; i < TotalNumberOfRows; i++) {
			
			for (int j = 0; j < TotalNumberOfCols; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
				
				
			}
		}

		wb.close();
		return arrayExcelData;
	}

}
