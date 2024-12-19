import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class ReservasiHotel implements InterfaceReservasi {
    private List<String> daftarReservasi;
    public ReservasiHotel() {
        this.daftarReservasi = new ArrayList<>();
    }
    @Override
    public void buatReservasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama untuk reservasi:");
        String nama = scanner.nextLine();
        daftarReservasi.add(nama);
        System.out.println("Reservasi atas nama " + nama + " telah dibuat.");
    }
    @Override
    public void batalkanReservasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama untuk membatalkan reservasi:");
        String nama = scanner.nextLine();
        if (daftarReservasi.remove(nama)) {
            System.out.println("Reservasi atas nama " + nama + " telah dibatalkan.");
        } else {
            System.out.println("Tidak ditemukan reservasi atas nama " + nama);
        }
    }
    public void tampilkanDaftarReservasi() {
        System.out.println("Daftar Reservasi:");
        for (String reservasi : daftarReservasi) {
            System.out.println(reservasi);
        }
    }
}