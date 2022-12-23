public class Netbook extends Komputer implements IMouse, IKeyboard, IPrinter{

    @Override
    public void hidupkan_os() {
        System.out.println("------------------------NETBOOK-------------------------");
        System.out.println("1. MENGHIDUPKAN NETBOOK: ");
        System.out.println("   Tekan tombol power pada keyboard dekat layar");
        System.out.println("   Tunggu proses booting selesai");
        
    }

    @Override
    public void matikan_os() {
        System.out.println("6. MEMATIKAN NETBOOK: ");
        System.out.println("   Tekan tombol CTRL + ALT + DEL/Windows > Shutdown");
        
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
