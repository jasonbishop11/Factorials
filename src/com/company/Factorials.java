package com.company;

public class Factorials {
    public static long calcFactorial(int num){
        long total = num;
        while (num>1){
            num--;
            total*=num;
        }
        return total;
    }

    public static double calcE(){
        double e = 1;
        double olde = 0;
        int counter = 1;
        while(e-olde > .001){
            olde = e;
            e+=1/(double)calcFactorial(counter);
            counter++;
        }
        return e;
    }

    public static void calcEX(int x){
        double e = 1;
        double olde = 0;
        int counter = 1;
        while(e-olde > .001){
            olde = e;
            e+=Math.pow(x,counter)/calcFactorial(counter);
            counter++;
        }
        System.out.printf("e is %2.3f \n", e);
    }

    public static void main(String[] args) {
        for (int i=1; i <= 10; i++) {
            System.out.println(calcFactorial(i));
        }

        System.out.println();

        for (int i=1; i <= 20; i++) {
            System.out.println(calcFactorial(i));
        }

        System.out.println();

        System.out.println(calcE());

        System.out.println();

        for (int i=1; i<=5; i++) {
            calcEX(i);
        }
    }
}

/*Output
        1
        2
        6
        24
        120
        720
        5040
        40320
        362880
        3628800

        1
        2
        6
        24
        120
        720
        5040
        40320
        362880
        3628800
        39916800
        479001600
        6227020800
        87178291200
        1307674368000
        20922789888000
        355687428096000
        6402373705728000
        121645100408832000
        2432902008176640000

        2.7182539682539684

        e is 2.718
        e is 7.389
        e is 20.085
        e is 54.598
        e is 148.413
*/