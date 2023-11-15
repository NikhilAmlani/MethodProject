package methodhomework;

public class Methodoverloading {
    static int myMethod(int n, int m){
        return n+m;
    }
    static double myMethod(double S, double K){
        return S+K;


    }

    public static void main(String[] args) {
        int digit = myMethod(8,5);
        double value = myMethod(4.5, 20.2);
        System.out.println(+digit);
        System.out.println(+value);

    }
}
