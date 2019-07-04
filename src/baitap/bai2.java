/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author BronzeForest
 */
public class bai2 {

    
    public static void main(String[] args) {
        int n = 15;
        System.out.println(n+ " số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    } 
    public static int Fibonacci(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }

    }
    public static int Fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
