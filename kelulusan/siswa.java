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
public class siswa {
    public static void main(String[] args) {
       Scanner nama = new Scanner(System.in);
        System.out.println("Masukan nama peserta didik");
        String namaSiswa = nama.nextLine();
        
        nilairapot siswasiswi = new nilairapot();
        siswasiswi.nilpot();
        
        nilaiekstra siswisiswa = new nilaiekstra();
        siswisiswa.nileks();
        
        double rataseluruhnya;
        rataseluruhnya = siswasiswi.nilpot()+siswisiswa.nileks();
        double total = rataseluruhnya/2;
        System.out.println("Rata-rata keseluruhan = "+total);
        
        if(total>=88){
            System.out.println("Selamat "+namaSiswa+" LOLOS");
        }else{
            System.out.println("Maaf nilai akhir ananda "+namaSiswa+" tidak mencukupi persyaratan");
        }
    }
    
}
