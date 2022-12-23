public class PC extends Komputer implements IMouse, IKeyboard, IPrinter{

    @Override
    public void hidupkan_os() {
        System.out.println("---------------------------PC---------------------------");
        System.out.println("1. MENGHIDUPKAN PC: ");
        System.out.println("   Monitor dan kabel power terhubung listrik");
        System.out.println("   Tekan tombol power pada keyboard PC / casing CPU Komputer");
        System.out.println("   Tekan tombol Power pada monitor");
        System.out.println("   Tunggu sampai booting selesai");
    }

    @Override
    public void matikan_os() {
        System.out.println("6. MEMATIKAN PC: ");
        System.out.println("   Klik kanan bagian kiri bawah (logo sistem operasi");
        System.out.println("   Pilih shutdown");
        
    }

    public void klik_kanan(){
        super.klik_kanan();
    }
    public void klik_kiri(){
        super.klik_kiri();
    }
    public void tekan_enter(){
        super.tekan_enter();
    }
    public void cetak_data(){
        super.cetak_data();
    }

}
