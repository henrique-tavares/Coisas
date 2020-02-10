package javacodes.recursivo;

import java.math.BigInteger;

public class Recursivo
{
    public static BigInteger fatorial(long num)
    {
        // BigInteger total = new BigInteger("1");

        // for (long i = num; i > 1; i--)
        // {
        //     total = total.multiply(BigInteger.valueOf(i));
        // }

        // return total;

        return (num < 1) ? BigInteger.ONE : BigInteger.valueOf(num).multiply(fatorial(num - 1));
    }

    public static BigInteger fibonacci(long num)
    {
        // BigInteger[] fib = new BigInteger[3];
        // fib[0] = new BigInteger("0");
        // fib[1] = new BigInteger("1");
        // fib[2] = new BigInteger("1");


        // if (num == 1 || num == 0) return BigInteger.ONE;

        // for (long i = 2; i <= num; i++)
        // {
        //     fib[0] = fib[1].add(fib[2]);

        //     fib[2] = fib[1];
        //     fib[1] = fib[0];
        // }

        // return fib[0];


        return (num == 1 || num == 0) ? BigInteger.ONE : BigInteger.ZERO.add(fibonacci(num - 1)).add(fibonacci(num - 2));
    }

    public static BigInteger somatorio(long num)
    {
        return (num > 0) ? BigInteger.valueOf(num).add(somatorio(num - 1)) : BigInteger.ZERO;
    }
}