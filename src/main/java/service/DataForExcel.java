package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import entity.Drug;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataForExcel {
	private int rows;
	private int columns;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public List<List<String>> getDataFromExcel(MultipartFile file){
		try {
			Workbook sb = Workbook.getWorkbook(file.getInputStream());
			Sheet sheet = sb.getSheet(0);
			int rows = sheet.getRows();
			int columns = sheet.getColumns();
			List<List<String>> allList = new ArrayList<List<String>>();
			for(int i=0;i<rows;i++) {
				List<String> rowsList = new ArrayList<String>();
				for(int j=0;j<columns;j++) {
					rowsList.add(sheet.getCell(j, i).getContents());
				}
				allList.add(rowsList);
			}
			return allList;
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public <T> List<T> getDataFromExcelByGeneric(MultipartFile file,T t){
		Workbook sb;
		Sheet sheet;
		try {
			sb = Workbook.getWorkbook(file.getInputStream());
			sheet = sb.getSheet(0);
			this.rows = sheet.getRows();
			this.columns = sheet.getColumns();
			List<T> list = new ArrayList<T>();
			for(int i=0;i<rows;i++) {
				if(t.getClass()==Drug.class) {
					Drug drug = new Drug();
				}
			}
			return list;
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
