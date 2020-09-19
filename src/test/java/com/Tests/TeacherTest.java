package com.Tests;

import com.Automation.Pojos.Teacher;
import com.Utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.*;

public class TeacherTest {
    @BeforeAll
    public static void setup() {
        baseURI=ConfigurationReader.getProperty ( "PRESCHOOL.URI" );
    }
    @Test
    public void getAllTeacher() {
        File file=new File ( "teacher.json" );
        Response response=
                given ().contentType ( ContentType.JSON ).
                        body ( file ).
                        when ().get ( "/teachers/" ).prettyPeek ();
   }
  }
