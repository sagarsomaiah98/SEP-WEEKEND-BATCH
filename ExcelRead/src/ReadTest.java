
public class ReadTest {
	
	
	public static  void main(String args[])
	{
		
		
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\SEP WEEKEND BATCH\\ExcelRead\\src\\TestData\\TESTSUITE.xlsx");
		
		int rowcount=xls.getRowCount("GMAIL");
		
		System.out.println(rowcount);
		
		String value=xls.getCellData("GMAIL", "TESTCASE", 5);
		
		//System.out.println(value);
		
		
		for(int i=2;i<=rowcount;i++) {
			
			String row1=xls.getCellData("GMAIL", "TCID", i);
			String row2=xls.getCellData("GMAIL", "TESTCASE", i);
			
			String row3=xls.getCellData("GMAIL", "STATUS", i);
			
			//System.out.println(row1+"  - "+row2+"  - "+row3);
			
			
			
			
		}
		
		
		xls.addColumn("GMAIL", "reports");
		
		
	}
}
