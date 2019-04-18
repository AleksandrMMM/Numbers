package mypack;


import java.util.Scanner;

public class Main {

   static int param = 600;

   static int sum (int a, int b, int c){
       int sum = a + b + c;
       return sum;
   }

   static void increaseParam(){
       param = param * 5;
   }
    public static void main(String[] args) {
        System.out.println("Привет ");
        byte b = 4;
        short d = 66;
        int h = 3678;
        int bin = 0b10110;
        int oct = 043;
        int hex = 0xA37;
        long l = 4950936;
        float q = (float)4.5;
        double f = 6.77;
        char ch = 'S';
        boolean bool = true;

        /* + - * / */
        int res = 5 / 2; //результат 2
        int res2 = 5 % 2; //результат 1
        double res1 = 5 / 2; //результат 2,5

        int suumma = sum(49, 56, 100);
        System.out.println(suumma);

        System.out.println(param);
        increaseParam();
        System.out.println(param);

        int one = 10;
        int two = 21;
        int result = two / one;
        System.out.println(result);

        /* > < >= <= == != &&(И) ||(ИЛИ) */

        //Управление следующему блоку передается только тогда, когда предыдущий не сработал
        if(b > d || d > h){
            System.out.println("Правда");
        } else if (res == 2) {
            System.out.println("Равно 2");
        } else {
            System.out.println("Не работает");
            one++; //11
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }

        int flag = 7;
        while(flag != 7){
            System.out.println("Hello");
            flag++;
        }

        do{
            System.out.println("Hello from do while");
        }while(flag != 7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, а потом целое число");
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        System.out.println("Введенная строка " + str + " Введенное число " + num); //конкатенация (склейка) строк


    }



}
