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
public class Baitap {
    public static void main(String[] args) {
        float[] A = {1,4,3,7,9,5};
        float max = A[0];
        float min = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max)
                max = A[i];
            if(A[i]<min)
                min = A[i];
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    
}
