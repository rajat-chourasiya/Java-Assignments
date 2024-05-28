// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.*;
class la_g {
   public static void main(String[] args){
      int[] var1 = new int[]{20, 45, 6, 59, 7, 81, 23, 45, 4};
      int var2 = var1[0];
      int var3 = var1[0];

      for(int var4 = 1; var4 < var1.length; ++var4) {
         if (var1[var4] < var3) {
            var3 = var1[var4];
         } else if (var1[var4] > var2) {
            var2 = var1[var4];
         }
      }

      System.out.println("The largest element is " + var2);
      System.out.println("The smallest element is " + var3);
   	}
}

