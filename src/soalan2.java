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
public class soalan2 {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan 3 nombor, pisahkan dengan spacebar & tekan ENTER: ");
  
  double nombor1 = input.nextDouble();
  double nombor2 = input.nextDouble();
  double nombor3 = input.nextDouble();
  double purata = (nombor1 + nombor2 + nombor3) / 3;
  
  System.out.println("Purata bagi nombor "+nombor1 + " " + nombor2 + " " + nombor3 + " adalah " + purata);
  }
    
}
