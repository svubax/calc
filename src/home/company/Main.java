package home.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
        String str = console.nextLine();
        calculator.Enter(str);
        }

    }

}
