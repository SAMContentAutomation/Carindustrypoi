package carindustry;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Sale {
	 public static void sale()
	    {
	        try
	        {
	            FileInputStream file = new FileInputStream(new File("Amount.xls"));
	 
	     
	            HSSFWorkbook workbook = new HSSFWorkbook(file);
	 
	            
	            HSSFSheet sheet = workbook.getSheetAt(6);
	            Iterator<Sheet> sheetIterator = workbook.sheetIterator();
	            System.out.println("Retrieving Sheets using Iterator");
	            while (sheetIterator.hasNext()) {
	                Sheet sheets = sheetIterator.next();
	                System.out.println("=> " + sheets.getSheetName());
	            }
	           
	            Iterator<Row> rowIterator = sheet.iterator();
	            
	            while (rowIterator.hasNext())
	            {
	                Row row = rowIterator.next();
	                
	                Iterator<Cell> cellIterator = row.cellIterator();
	                 
	                while (cellIterator.hasNext())
	                {
	                 
	    					Cell cell = cellIterator.next();
	    					
	    					switch(cell.getCellType()) {
	    						case STRING:
	  							System.out.print(cell.getStringCellValue() + "\t\t");
	    							break;
	    						case NUMERIC:
	    							System.out.print(cell.getNumericCellValue() + "\t\t");
	    							break;
							default:
								break;
	    						
	    					
	                }
	                }
	                System.out.println("");
	            
	            }
	       file.close();
	        }    
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
   }

	