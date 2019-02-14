/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc 09
 */
import java.util.Scanner;
public class soalan3 {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan jejari silinder: " );
  double jejari = input.nextDouble();
  
  System.out.print("Masukkan tinggi silinder: " );
  double tinggi = input.nextDouble();
  
  double isipadu;
  isipadu=3.142*jejari*jejari*tinggi;
  
  System.out.println("Isipadu sebuah silinder yang mempunyai jejari "+jejari + " dan tinggi " +tinggi+ " adalah " + isipadu);
  }
}
