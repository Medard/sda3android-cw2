/**
 * Created by Adrian on 2017-02-25.
 */
public class MyMath {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static long max(long a, long b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static float max(float a, float b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static double max(double a, double  b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static int pow (int a, int n) {
        int wynik = 1;
        for(int i =0 ; i <n ;i ++) {
            wynik *= a;
        }
        return wynik;
    }
}
