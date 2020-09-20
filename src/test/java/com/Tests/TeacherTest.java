package com.Tests;

import com.Automation.Pojos.Teacher;
import com.Utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import static io.restassured.RestAssured.*;

public class TeacherTest {
    @BeforeAll
    public static void setup() {
        baseURI=ConfigurationReader.getProperty ( "PRESCHOOL.URI" );
    }
    @Test
    public void getAllTeacher() throws IOException {
               Response response=
                given ().contentType ( ContentType.JSON ).
                        when ().get ( "/teachers/" ).prettyPeek ();
        List<Teacher>listofTeachers=response.jsonPath ().getList ( "_embedded.teachers",Teacher.class );


        HSSFWorkbook workbook = new HSSFWorkbook ();

        HSSFSheet sheet = workbook.createSheet ("Teacher List");

        HSSFRow row;


        int rowRecord = 0;

        for(Teacher each : listofTeachers){
            row = sheet.createRow ( rowRecord++ );

            int cellRecord=0;

                Cell cell1 = row.createCell ( cellRecord++ );
                cell1.setCellValue ( each.getFirstName ());
                Cell cell2 = row.createCell ( cellRecord++ );
                cell2.setCellValue ( each.getLastName ());
                Cell cell3 = row.createCell ( cellRecord++ );
                cell3.setCellValue ( each.getPhone ());
        }

        FileOutputStream out = new FileOutputStream (new File ("Teacher Data.xls")  );

        workbook.write (out);
        out.close ();
        System.out.println ("Teacher Data writen successfully");

    }

  }
