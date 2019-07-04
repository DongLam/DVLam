/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;


public class bai4 {

  public static void tach(String A){
      ArrayList<String> item = new ArrayList();
      String tmp = null;
      for (int i = 0; i < A.length(); i++) {
          if(A.charAt(i) <= '9' && A.charAt(i) >= '0'){
              System.out.println(i);
              for(int j=i+1;j<A.length()-i;j++){
                  if(A.charAt(j) <= '0' || A.charAt(j) >= '9'){
                       tmp =  A.substring(i, j-1);
                       item.add(tmp);
                  } 
              }
          }
      }
      for (int i = 0; i < item.size(); i++) {
             System.out.println(item.get(i));
        }
  }
    public static void main(String[] args) {
       String A = "asd123sdka#%12384&9asjdn";
       tach(A);     
 }
}
    

