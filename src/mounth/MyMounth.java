package mounth;

import java.util.Scanner;

public class MyMounth {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int mount = (int) scanner.nextInt();

        {
            if (mount == 1 || mount == 2 || mount == 12)
            {
                System.out.println("зима");
            } else if (mount >= 3 && mount <= 5)
            {
                System.out.println("весна");
            } else if (mount >= 6 && mount <= 8)
            {
                System.out.println("лето");
            } else if (mount >= 9 && mount <= 11)
            {
                System.out.println("осень");
            }
        }
    }


    }
