/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPBO;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PeminjamanExample {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        PeminjamanRecord nasabah=new PeminjamanRecord();
        
        String nama,kodepinjam,tglpinjam;
        int jumlahpinjam,angsuran,bunga,lamapinjam;
        
        System.out.print("Masukkan Kode Pinjam : ");
        kodepinjam=in.nextLine();
        System.out.print("Masukkan Nama Nasabah : ");
        nama=in.nextLine();
        System.out.print("Masukkan Tanggal Peminjaman : ");
        tglpinjam=in.nextLine();
        System.out.print("Masukkan Jumlah Peminjaman : ");
        jumlahpinjam=in.nextInt();
        System.out.print("Masukkan Lama Peminjaman(Bulan) : ");
        lamapinjam=in.nextInt();
        
        nasabah.setkodepinjam(kodepinjam);
        nasabah.setNama(nama);
        nasabah.settglpinjam (tglpinjam);
        nasabah.setjumlahpinjam(jumlahpinjam);
        nasabah.setlamapinjam(lamapinjam);
        
        nasabah.print(nasabah.getkodepinjam(),nasabah.getNama(),nasabah.gettglpinjam(),nasabah.getjumlahpinjam(),nasabah.getlamapinjam(),nasabah.getbunga(),nasabah.getangsuran());
    }
}
