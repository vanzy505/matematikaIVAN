/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikav;

/**
 *
 * @author iv4nm
 */
import java.util.Scanner;
        
public class MatematikaVcanggihberaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MatematikaVcanggih mtk = new MatematikaVcanggih();
        mtk.pilihan();

        System.out.print("Masukkan Pilihan anda : ");
        mtk.pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama : ");
        mtk.angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua : ");
        mtk.angka2 = input.nextInt();

        mtk.getpilihan();
    }
}
