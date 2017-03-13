package com.pavan.smile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class SignIn extends FacebookOpenPage implements UserId{

	String[][] UserIds={
		{"pavan","power"},{"kumar","star"},{"pk","ps"},{"mmp","MMP"},{"pavanyamini45@gmail.com","powerstar244"}
	};
	@DataProvider(name="UserId")
	public Object[][] SignInIds(){
		//return UserIds;
		return getFromSpreadSheet("FacebookIds.xls","UnitTesting","FacebookId");
	}

	@Test(dataProvider="UserId")
	public void f(String userId,String passWord) throws InterruptedException {
		WebElement email = driver.findElement(By.id(EMAIL));
		email.sendKeys(userId);
		Thread.sleep(1000);

		WebElement passWord1 = driver.findElement(By.id(PassWord));
		passWord1.sendKeys(passWord);
		Thread.sleep(1000);

		WebElement signIn = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		signIn.click();
		Thread.sleep(1000);
	}	
		@Test
		public void PassWordIdBlank(){
			
	}
		public String[][] getFromSpreadSheet(String filename,String sheetName,String tableName){
			//read from spread sheet
			 String[][] tabArray=null;
			 Workbook workbook=null;
		        try{
		             workbook = Workbook.getWorkbook(new File(filename));
		            Sheet sheet = workbook.getSheet(sheetName);
		            int startRow,startCol, endRow, endCol,ci,cj;
		            Cell tableStart=sheet.findCell(tableName);
		            startRow=tableStart.getRow();
		            startCol=tableStart.getColumn();

		            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               

		            endRow=tableEnd.getRow();
		            endCol=tableEnd.getColumn();
		            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
		                    "startCol="+startCol+", endCol="+endCol);
		            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
		            ci=0;

		            for (int i=startRow+1;i<endRow;i++,ci++){
		                cj=0;
		                for (int j=startCol+1;j<endCol;j++,cj++){
		                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
		                }
		            }
		        }
		        catch (Exception e)    {
		            System.out.println("error in getTableArray()");
		        }

		        return(tabArray);
		
			
		}
}
