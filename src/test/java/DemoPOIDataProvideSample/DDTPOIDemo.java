package DemoPOIDataProvideSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTPOIDemo {
	
	@Test(dataProvider = "getDataSupplier")
	public void loginTest(Object obj[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys((CharSequence[]) obj[0]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys((CharSequence[]) obj[1]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).isDisplayed());
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@DataProvider(name="getDataSupplier", parallel = true)
	public Object[][] dataSupplier() {
		String excelFilepath = System.getProperty("user.dir")+"\\files\\ninjatutorial.xlsx";
		File excelfile = new File(excelFilepath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
		    workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet = workbook.getSheet("login");
		
		int rowsCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowsCount][colCount];
		
		for(int r=1;r<rowsCount;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0; c<colCount;c++) {
				XSSFCell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					data[r][c] = cell.getStringCellValue(); 
					c++;
					break;
					
				case NUMERIC:
					data[r][c] = (int)cell.getNumericCellValue();
					c++;
					break;
					
				case BOOLEAN:
					data[r][c] = cell.getBooleanCellValue();
					c++;
					break;
					
				}
			}
		}
		
		/*int r = 0;
		int c = 0;
		Row row = rows.next();
		Iterator<Row> rows = sheet.iterator();
		while(rows.hasNext()) {
			row = rows.next();
			Iterator<Cell> cells = row.iterator();
			while(cells.hasNext()) {
				Cell cell = cells.next();
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					data[r][c] = cell.getStringCellValue(); 
					c++;
					break;
					
				case NUMERIC:
					data[r][c] = (int)cell.getNumericCellValue();
					c++;
					break;
					
				case BOOLEAN:
					data[r][c] = cell.getBooleanCellValue();
					c++;
					break;
					
				}
				
			}
			r++;
			c=0;
			
		}*/
		
		return data;
	}

}
