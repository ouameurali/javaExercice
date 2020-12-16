package codingame;

public class PrintPascal {
    public static void main(String[] args) {


        System.out.println(binomialCoeff(6, 3));


    }

    static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;
        //res = facto(l) / (facto(c) * facto(l - c));

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }


    static int facto(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return (res);
    }
}
