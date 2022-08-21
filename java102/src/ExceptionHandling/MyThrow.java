package ExceptionHandling;

import java.util.Scanner;

public class MyThrow {

    public static void  checkAge(int age) throws AgeCheckException {
        if (age < 18){
            throw new AgeCheckException("Age error is received!");
        }

        System.out.println("Your age is appropriate");
    }

    public static void main(String[] args) throws AgeCheckException {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        try{
            checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e);
        }

        System.out.println("Program has been closed!");
    }


}
