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
public class soalan4 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Maukkan panjang taman permainan tersebut: " );
  double panjang = input.nextDouble();
  
  System.out.print("Masukkan lebar taman permainan tersebut: " );
  double lebar = input.nextDouble();
  
  double luas;
  luas=panjang*lebar;
  
  System.out.println("Luas bagi taman permainan tersebut adalah " + luas+" persegi");
  }
}
