package com.Tests;
import com.Automation.Pojos.sunCities;
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

public class MetaWeatherSan {
    @BeforeAll
    public static void setup() {
        baseURI=ConfigurationReader.getProperty ( "URL.URI" );
    }
    @Test
    public void getAllSanCities() throws IOException {
               Response response=
                given ().contentType ( ContentType.JSON ).
                        when ().get ( "/api/location/search/?query=san" ).prettyPeek ();
      List<sunCities> sunCitiesList=response.jsonPath ().getList("",sunCities.class);

       System.out.println (sunCitiesList);
        HSSFWorkbook workbook = new HSSFWorkbook ();

        HSSFSheet sheet = workbook.createSheet ("City List");

        HSSFRow row;


        int rowRecord = 0;

        for(sunCities each : sunCitiesList){
            row = sheet.createRow ( rowRecord++ );

            int cellRecord=0;

                Cell cell1 = row.createCell ( cellRecord++ );
                cell1.setCellValue ( each.getTitle ());
                Cell cell2 = row.createCell ( cellRecord++ );
                cell2.setCellValue ( each.getWoeid ());
                Cell cell3 = row.createCell ( cellRecord++ );
                cell3.setCellValue ( each.getLattlong ());
        }

        FileOutputStream out = new FileOutputStream (new File ("Weather Data.xls")  );

        workbook.write (out);
        out.close ();
        System.out.println ("Weather Data writen successfully");

    }

  }
