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
public class nilaiekstra {
    
    Scanner input = new Scanner(System.in);
    int nilaiekss;

    int nileks() {
        System.out.println("Masukan nilai rata-rata ekstrakulikuler peserta didik");
        nilaiekss = input.nextInt();
        return nilaiekss;
    }
}
