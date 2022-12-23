public abstract class Komputer implements IMouse, IKeyboard, IPrinter{

    public abstract void hidupkan_os();
    public abstract void matikan_os();

    @Override
    public void tekan_enter() {
        System.out.println("4. Tekan ENTER");
        System.out.println("   Membuat baris baru/membuka aplikasi");
        
    }

    @Override
    public void cetak_data() {
        System.out.println("5. Cetak Data");
        System.out.println("   Mencetak dokumen");
             
    }

    @Override
    public void klik_kanan() {
        System.out.println("3. Klik Kanan");
        System.out.println("   Menampilkan pilihan lain");
        
    }

    @Override
    public void klik_kiri() {
        System.out.println("2. Klik Kiri");
        System.out.println("   Membuka sebuah aplikasi");
        
    }

    
}
