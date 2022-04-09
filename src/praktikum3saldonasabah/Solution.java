/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3saldonasabah;
import java.util.Scanner;
/**
 *
 * @author REGIN
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double awal = sc.nextDouble();
        double tambahan = sc.nextDouble();
        System.out.println(saldoFinal(awal, tambahan));
    }
    static double pengurangan(double awal, double tambahan){
        double saldo = awal+tambahan;
        double admin = saldo-7000;
        return admin;
    }
    static double saldoFinal(double awal, double tambahan){
        double bonus = 0.0005;
        double hasilBonus = pengurangan(awal, tambahan)*bonus;
        double saldoFinall= pengurangan(awal, tambahan)+hasilBonus;
        return saldoFinall;
    }
}