import java.util.Scanner;

public class gurutester {
    //contructor 
    public static void main(String[] args) {



        //String-->int-->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama :");
        String nama = input.nextLine();
        System.out.println("Mapel :");
        String mapel = input.nextLine();
        System.out.println("Status :");
        String status = input.nextLine();
        System.out.println("NIP :");
        int nip = input.nextInt();

        Guru guru = new Guru (nip, nama, mapel, status);
        guru.print();
    

        
        Guru BuPasha = new Guru(3456, "Bu Pasha", "RPL", "Tetap");
        Guru PakThoriq = new Guru(1567, "Pak Thoriq", "Pj"," Part-Time");
        Guru Bujevi = new Guru(4980, "Bu Jevi", "Inggris", "Full-Time");
        Guru PakAndre = new Guru(8976, "Pak Andre", "Inggris", "Tetap");
        Guru PakFalah = new Guru(4569, "Pak Falah", "Bahasa indo", "Tetap");




        BuPasha.print();
        System.out.println("----------");
        PakThoriq.print();
        System.out.println("----------");
        Bujevi.print();
        System.out.println("----------");
        PakAndre.print();
        System.out.println("----------");
        PakFalah.print();
        System.out.println("----------");
 
       
    }
}
