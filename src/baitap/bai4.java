/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;


public class bai4 {

    public static void main(String[] args) {
       String A = "asd123sdka#%12384&9asjdn";
        A = A.replaceAll("[^0-9]", " ");
        String[] item = A.split("\\s");
        for (int i = 0; i < item.length; i++) {
             try {
                Double.parseDouble(item[i]);
                System.out.println(item[i]);
            } catch (NumberFormatException e) {
            }
        }
        
 }
}
    

