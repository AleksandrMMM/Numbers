package Volume;

public class Volume {
    public static void main (String[] args ){
        int a = 23;
        int h = 34;
        int n = 4;
        double V  = (n * Math.pow(a, 2) * h) / (12 * Math.tan( Math.toRadians(180.0 / n) ) );
        System.out.println(V);
    }
}
