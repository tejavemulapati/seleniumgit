package parameter;
import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class ReadExcelSheet {

	static Xls_Reader reader;
	
	//This method return type is object
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> array1 = new ArrayList<Object[]>();
		
		try {//Handle exception if excel file is not available in below location
			reader = new Xls_Reader("C:\\Users\\Teja_Vemulapati.ASIA-PACIFIC\\eclipse-workspace\\SeleniumConcepts\\src\\datainput.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum =2; rowNum <= reader.getRowCount("Login"); rowNum++) {
			String username = reader.getCellData("Login", "Username", rowNum);
			String password = reader.getCellData("Login", "Password", rowNum);
			
			Object obj[] = {username,password};
			
			array1.add(obj);
		}
		//come out of for loop and return mydata
		return array1;
	}
}
