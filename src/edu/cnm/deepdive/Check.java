package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {

  public static int digitSum(int var) {
    String str;
    int var1 = 0;
    str = Integer.toString(var);
    for(int i = 0; i < str.length(); i++){
      var1 +=  str.charAt(i) -48;
    }
    return var1;
    
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("User Input:  ");
    int var = scanner.nextInt();
    Check.digitSum(var);
    System.out.println(var / 9);
    System.out.println(digitSum(var));
    System.out.println(digitSum(var) / 9);
  }

}
