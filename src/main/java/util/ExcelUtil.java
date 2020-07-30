package util;

import org.apache.poi.hssf.usermodel.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelUtil
{
	public static void createHead(HSSFSheet sheet, String[] heads)
	{
		HSSFRow row = sheet.createRow(0);

		for (int i = 0; i < heads.length; i++)
		{
			row.createCell(i).setCellValue(heads[i]);
		}
	}


	public static void createExcel(List<String[]> datas, String filePath, String[] heads)
	{
		HSSFWorkbook workbook = new HSSFWorkbook();
		int sheetnum = 1;
		HSSFSheet sheet = workbook.createSheet("sheet" + sheetnum);
		createHead(sheet, heads);
		int rownum = 1;
		for (String[] data : datas)
		{
			HSSFRow row = sheet.createRow(rownum++);
			for (int i = 0; i < data.length; i++)
			{

					row.createCell(i).setCellValue(data[i]);

			}
			if (rownum > 50000)
			{
				sheetnum++;
				sheet = workbook.createSheet("sheet" + sheetnum);
				createHead(sheet, heads);
				rownum = 1;
			}
		}

		createFile(workbook, filePath);
	}

	public static void createExcel1(List<String[]> datas, String filePath, String[] heads)
	{
		HSSFWorkbook workbook = new HSSFWorkbook();
		int sheetnum = 1;
		HSSFSheet sheet = workbook.createSheet("sheet" + sheetnum);
		createHead(sheet, heads);
		int rownum = 1;
		for (String[] data : datas)
		{
			HSSFRow row = sheet.createRow(rownum++);
			for (int i = 0; i < data.length; i++)
			{
				row.createCell(i).setCellValue(data[i]);
			}
			if (rownum > 50000)
			{
				sheetnum++;
				sheet = workbook.createSheet("sheet" + sheetnum);
				createHead(sheet, heads);
				rownum = 1;
			}
		}

		createFile(workbook, filePath);
	}

	/**
	 * 如若单元格包含“，”，则自动换行
	 */
	public static void createExcelss(List<String[]> datas, String filePath, String[] heads)
	{
		HSSFWorkbook workbook = new HSSFWorkbook();
		int sheetnum = 1;
		HSSFSheet sheet = workbook.createSheet("sheet" + sheetnum);
		createHead(sheet, heads);
		int rownum = 1;

		HSSFCellStyle cellStyle=workbook.createCellStyle();
		cellStyle.setWrapText(true);

		for (String[] data : datas)
		{
			HSSFRow row = sheet.createRow(rownum++);
			for (int i = 0; i < data.length; i++)
			{
				if(data[i].contains(","))
				{
					HSSFCell cell = row.createCell((short)i);

					cell.setCellStyle(cellStyle);

					cell.setCellValue(new HSSFRichTextString(data[i]));
				}
				else
				{
					row.createCell(i).setCellValue(data[i]);
				}
			}
			if (rownum > 50000)
			{
				sheetnum++;
				sheet = workbook.createSheet("sheet" + sheetnum);
				createHead(sheet, heads);
				rownum = 1;
			}
		}

		createFile(workbook, filePath);
	}

	public static void createExcel(Map<String, List<String[]>> datas, String filePath, String[] heads)
	{
		HSSFWorkbook workbook = new HSSFWorkbook();

		for(String key : datas.keySet())
		{
			int sheetNum = 0;
			HSSFSheet sheet = workbook.createSheet(key);
			createHead(sheet, heads);

			int rowNum = 1;
			for(String[] s : datas.get(key))
			{
				HSSFRow hssfRow = sheet.createRow(rowNum);
				for (int i = 0 ; i < s.length; i++)
				{
					hssfRow.createCell(i).setCellValue(s[i]);
				}
				rowNum++;
				if (rowNum > 50000)
				{
					sheet = workbook.createSheet(key + " " + sheetNum);
					createHead(sheet, heads);
					sheetNum++;
					rowNum = 1;
				}
			}
		}

		createFile(workbook, filePath);
	}

	public static void createFile(HSSFWorkbook workbook, String filePath)
	{
		try
		{
			File file = new File(filePath);
			if (!file.getParentFile().exists())
			{
				if (file.getParentFile().mkdirs())
				{
					FileOutputStream os = new FileOutputStream(file);
					workbook.write(os);
					os.close();
				}
				else
				{
					System.out.println("创建文件失败");
				}
			}
			else
			{
				FileOutputStream os = new FileOutputStream(file);
				workbook.write(os);
				os.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static List<String[]> readExcel(File excelFile, int sheetIndex)
	{
		List<String[]> list = null;
		try
		{
			list = new ArrayList<String[]>();
			FileInputStream is = new FileInputStream(excelFile);
			HSSFWorkbook workbook = new HSSFWorkbook(is);
			HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
			int rownum = sheet.getLastRowNum();

			for (int i = 0; i <= rownum; i++)
			{
				HSSFRow row = sheet.getRow(i);
				String cellValue1 = row.getCell(0).getStringCellValue();
//				String cellValue2 = row.getCell(1).getStringCellValue();

//				if (cellValue2.replaceAll("\\s", "").length() == 20)
//				{
//					list.add(new String[]{cellValue1, cellValue2.replaceAll("\\s", "")});
//				}

				list.add(new String[]{cellValue1});
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return list;
	}

}
