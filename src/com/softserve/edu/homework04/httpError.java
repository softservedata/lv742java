package com.softserve.edu.homework04;
import java.util.Scanner;
public enum httpError {
    HTTP_error1("Bad Request"),
    HTTP_error2("Payment Required"),
    HTTP_error3("Unauthorized "),
    HTTP_error4("Forbidden"),
    HTTP_error5("Not Found");
    private String ErrorNumber;

    httpError(String ErrorNumber) {
        this.ErrorNumber = ErrorNumber;
    }
    @Override
    public String toString() {
        return "HTTP Error: "+ErrorNumber;
    }
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the code HTTP Error (400-404): ");
            int code = scanner.nextInt();

            switch (code){
                case (400):
                    System.out.print(httpError.HTTP_error1);
                    break;
                case (401):
                    System.out.print(httpError.HTTP_error2);
                    break;
                case (402):
                    System.out.print(httpError.HTTP_error3);
                    break;
                case (403):
                    System.out.print(httpError.HTTP_error4);
                    break;
                case (404):
                    System.out.print(httpError.HTTP_error5);
                    break;
                default:
                    System.out.print("no such error exists");
            }
        }
    }



}
