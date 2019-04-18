package HelloSort;

public class HelloSort {
    public static void main (String[] args) {
       int mSize = 200;


        int M[] = new int[mSize];
        int x = 120;
        int y = 240;
        int i = 0;
        int iMax = M.length;
        while (i <iMax){
            M[i] = (int) (Math.random()*(y-x)+ x);

            System.out.printf("%d: %d\n", i, M[i]);
            i++;

        }
        //Загуглить про алгоритм пузырьковой сортировки,
        // попытаться реализовать алгоритм сортировки массива M
        // после сортировки вывести массив
    }
}
