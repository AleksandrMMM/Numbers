package Hello;

public class Hello {
    public static void main(String[] args){
        int a = 5;
        int[] A = {1, 2, 3};
        if (A[1] == a){
            System.out.printf("%d\n", a);
        } else {
            System.out.printf("%d\n", A[2]);
        }
        int i = 0;
        int iMax = A.length;
        while (i < iMax) {
            System.out.printf("%d: %d\n", i, A[i]);
            i = i+1;
        }

        int x = 120;
        int y = 240;
        i = 0;
        while (i <iMax){
            A[i] = (int) (Math.random()*(y-x)+ x);

            System.out.printf("%d: %d\n", i, A[i]);
            i++;

        }

        int n = 45;
        int m = 33;

        n = m+n;
        m = n - m;
        n = n - m;

        System.out.println(n);
        System.out.println(m);
    }
}


