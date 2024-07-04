package com.example.exception;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number between 1 and 10");
      try{
          int number=scanner.nextInt();
          if (number<1 || number>10){
              throw new InvolidNumberException();


          }

      } catch(InvolidNumberException e){
          System.out.println(e.getMessage());
      }

    }
}