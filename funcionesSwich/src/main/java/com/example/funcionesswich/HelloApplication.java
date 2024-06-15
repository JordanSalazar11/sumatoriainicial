package com.example.funcionesswich;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printAnyString("Hi you are the best program, the program has some option such as: A, B and C");
        printAnyString("Please type any opcion");
        String readdingString = scanner.nextLine();
        switch (readdingString.toLowerCase()) {
            case "a":
                printAnyString("Now you are in sum program");
                printAnyString("Typing the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Typing the second number");
                int numbertwo = scanner.nextInt();
                int sumresult = sumNumbers(numberOne, numbertwo);
                printAnyString("the result of sum is: " + sumresult);
            case "b":
                printAnyString("Now you are in String Program");
                String readString = scanner.nextLine();
                printAnyString("The result is: " + readString);
                break;
            case "c":
                printAnyString("Now you are in Cosine Program");
                printAnyString("Typing the number to calculate its cosine");
                int number = scanner.nextInt();
                double cosineResult = calculateCosine(number);
                printAnyString("The cosine of " + number + " is: " + cosineResult);
                break;
            default:
                printAnyString("Invalid option, please type A, B or C");
                break;



        }


    }

        public static void printAnyString(String message){
            System.out.println(message);

        }

        public static int sumNumbers(int numberOne, int numberTwo) {
            int result = numberOne + numberTwo;
            return result;
        }
    public static double calculateCosine(int number) {
        // Convertir grados a radianes
        double radians = Math.toRadians(number);
        // Calcular coseno del ángulo en radianes
        return Math.cos(radians);
    }
    public static void imprimir(double resultado) {
        System.out.println("El resultado del coseno es: " + resultado);

    }
}