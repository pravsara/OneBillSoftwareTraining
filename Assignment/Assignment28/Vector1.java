package com.onebill.corejava.basics.Assignment28;

import java.util.*;

public class Vector1{
   public static void main(String[] arg) {
      Vector<Integer> vector = new Vector<Integer>();
      vector.add(9);
      vector.add(3);
      vector.add(30);
      vector.add(1);
      vector.add(40);
      System.out.println("The vector is: " + vector);
      vector.remove(1);
      System.out.println("The vector after an element is removed is: " + vector);
   }
}
