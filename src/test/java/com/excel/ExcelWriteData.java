package com.excel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelWriteData {
    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook (); // Create blank workbook

        HSSFSheet sheet = workbook.createSheet ("PhoneBook"); // Create blank Sheet

        HSSFRow row; // Create Row object

        // Data as (Object[])
        Map< String, Object[] > dataInfo = new TreeMap< String, Object[] > ();
        dataInfo.put("1",new Object[]{"FIRST NAME", "LAST NAME", "PHONE NUMBER"});
        dataInfo.put("2",new Object[]{"Bulent","Selcuk","832-212-7401"});
        dataInfo.put("3",new Object[]{"Meltem", "Selcuk", "832-228-3666"});
        dataInfo.put("4",new Object[]{"Doga","Selcuk","281-967-5742"});
        dataInfo.put("5",new Object[]{"Sam","Selcuk","281-911-5743"});
        dataInfo.put("6",new Object[]{"Yuki","Selcuk","832-911-9143"});
        //Iterate over data and write to sheet
        Set<String> record = dataInfo.keySet ();
        int rowRecord = 0;

        for(String x : record){
            row = sheet.createRow ( rowRecord++ );
            Object[] y = dataInfo.get ( x );
            int cellRecord=0;

            for(Object obj : y){
                Cell cell = row.createCell ( cellRecord++ );
                cell.setCellValue ( (String)obj );
            }
        }
        // Write the workbook in file system
        FileOutputStream out = new FileOutputStream (new File ("Teacher Data.xls")  );

        workbook.write (out);
        out.close ();
        System.out.println ("Teacher Data writen successfully");



    }


}
