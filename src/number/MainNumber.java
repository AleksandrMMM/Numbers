package number;
import java.util.Scanner;

public class MainNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = (int) scanner.nextInt();
        if ( num > 0){
            System.out.println("Yes");
        } else if(num < 0) {
            System.out.println("No");
        } else {
            System.out.println("Не надо вводить ноль");
        }

        }


    }
