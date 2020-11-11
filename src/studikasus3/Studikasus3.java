/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus3;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
public class Studikasus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        int awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");

        
                    System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    
                    }
        
    }
}
