package learning;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

interface A {
	public static void test() {
		System.out.println("interface");
	}
}

public class A3 implements A {
	public static void test() {
		System.out.println("class");
	}

	public static void star() {

		System.out.println("power of " + Math.pow(1.0166, 24));
		int n = 6;
		for (int i = 0; i < n; i++) {
			/*for (int j = (n - i); j > 1; j--) {
				System.out.print(" ");
			}*/

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void stt() throws Exception {

		String st = "C:\\Users\\nrampelly\\Desktop\\phone.xlsx";

		File f = new File(st);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheetAt(0);

		System.out.println(
				sh.getRow(1).getCell(0).getStringCellValue() + "" + sh.getRow(1).getCell(1).getNumericCellValue());
		// XSSFRow row = sh.getRow(0);

		/*
		 * Iterator<Row> ro = sh.rowIterator(); while (ro.hasNext()) { Row row =
		 * ro.next();
		 * 
		 * Iterator<Cell> celIt = row.cellIterator(); while (celIt.hasNext()) { XSSFCell
		 * cell = (XSSFCell) celIt.next(); if(cell.getCellTypeEnum()==CellType.STRING) {
		 * 
		 * System.out.println("Cell value" + cell.getNumericCellValue());
		 * 
		 * break;
		 * 
		 * case Cell.CELL_TYPE_STRING: System.out.println("Cell value" +
		 * cell.getStringCellValue()); break; } }
		 * 
		 * }
		 */
		Iterator<Row> ro = sh.rowIterator();
		while (ro.hasNext()) {
			Row row = ro.next();

			if (row.getCell(0).getStringCellValue().equals("Pavan")) {
				System.out.println(row.getRowNum());
			}
			List<String> sta = new ArrayList<String>();
			sta.add(row.getCell(0).getStringCellValue());
			sta.forEach(e -> {
				System.out.println(e);
			});
		}

	}

	public static void main(String[] args) throws Exception {

		A2.swap();
		A.test();
		System.out.println("A3 class method" + (4 % 10));
		// TODO Auto-generated method stub
		A3 a2 = new A3();
		a2.test();

		star();
		String c = "12";
		String b = "12";
		String s = new String("abc");
		String v = new String("abc");
		String[] le = { "adgf" };

		System.out.println("s " + le.length);
		System.out.println("v" + c.hashCode());
		if (c == b) {
			System.out.println(true);
		}

	}

}
