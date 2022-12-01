package UTSPBO;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PeminjamanRecord{
        
        private int bunga;
        private int angsuran;
        private int jumlahpinjam;
        private int lamapinjam;
        private String nama;
        private String kodepinjam;
        private String tglpinjam;
        
         public PeminjamanRecord(){
    }

    public void setkodepinjam(String kodepinjam){
        this.kodepinjam=kodepinjam;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public void settglpinjam(String tglpinjam){
        this.tglpinjam=tglpinjam;
    }

    public void setjumlahpinjam(int jumlahpinjam){
        this.jumlahpinjam=jumlahpinjam;
    }
    
    public void setlamapinjam(int lamapinjam){
    this.lamapinjam=lamapinjam;
    }
    
    public String getkodepinjam(){
        return kodepinjam;
    }

    public String getNama(){
        return nama;
    }
    
    public String gettglpinjam(){
        return tglpinjam;
    }
    
     public int getjumlahpinjam(){
        return jumlahpinjam;
    }
    
    public int getlamapinjam(){
        return lamapinjam;
    }
    
    public int getbunga(){
        bunga=((10*jumlahpinjam)/100)/lamapinjam;
        
        return bunga;
    }

    public int getangsuran(){
        angsuran=(jumlahpinjam/lamapinjam)+bunga;
        return angsuran;
    }
    
    public void print(String kodepinjam,String nama,String tglpinjam,int jumlahpinjam,int lamapinjam,int bunga,int angsuran){
        System.out.println("\n============= Data Peminjaman Nasabah ==============");
        System.out.println("Kode Pinjam \t : "+kodepinjam);
        System.out.println("Nama Nasabah \t : "+nama);
        System.out.println("Tanggal Peminjaman \t : "+tglpinjam);
        System.out.println("Jumlah Peminjaman \t : "+jumlahpinjam);
        System.out.println("Lama Peminjaman(Bulan) \t : "+lamapinjam);
        System.out.println("Bunga \t\t : "+bunga);
        System.out.println("Angsuran \t\t : "+angsuran);
    }
}

 


