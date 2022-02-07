/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class nilairapot {

    Scanner input = new Scanner(System.in);
    int nilairapott;

    int nilpot() {
        System.out.println("Masukan nilai rata-rata rapot peserta didik");
        nilairapott = input.nextInt();
        return nilairapott;
    }
}
