package BasicCoreProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Boolean flag = true;
        System.out.println("Enter Year to check it leap or not");
        Scanner sc= new Scanner(System.in);
        int Year= sc.nextInt();

        if (Year%4 == 0 && Year%100 != 0 || Year%400 == 0) {
            flag = true;
            System.out.println(flag);
        }
        else {
            flag = false;
            System.out.println(flag);

        }

    }
}
