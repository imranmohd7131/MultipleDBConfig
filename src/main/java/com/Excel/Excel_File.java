package com.Excel;

import org.springframework.stereotype.Component;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Component
public class Excel_File {

	String excelFilePath = "Data.xlsx";
	XSSFWorkbook workbook=new XSSFWorkbook(); 					//create workbook in .xlsx format
	XSSFSheet sheet=workbook.createSheet("Excel_data");  	//create  sheet
	XSSFCellStyle style=workbook.createCellStyle();
	XSSFFont font = workbook.createFont();
	
	int r=1;
	
//	public String getFile(List<Tbl_Billing_Inter> data) throws IOException {
//	
//		if(data.isEmpty()) {
//			
//		}else {
//			style.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
//			style.setFillPattern(FillPatternType.LESS_DOTS);	
//			font.setFontHeightInPoints((short) 15);
//			font.setBold(true);
//			style.setFont(font);
//			
//			XSSFRow row=sheet.createRow(0);
//			XSSFCell cell=row.createCell(0);
//			cell.setCellValue("ANI");
//			cell.setCellStyle(style);
//			
//			cell=row.createCell(1);
//			cell.setCellValue("Process Datetime");
//			cell.setCellStyle(style);
//			
//			for(Tbl_Billing_Inter tr : data) {
//			
//				row=sheet.createRow(r++);
//			 
//				row.createCell(0).setCellValue(tr.getANI());
//				row.createCell(1).setCellValue(tr.getPROCESS_DATETIME());	
//	
//			}
//		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
//		workbook.write(outputStream);
//		
//		}
//		return "success";
//
//	}
}
