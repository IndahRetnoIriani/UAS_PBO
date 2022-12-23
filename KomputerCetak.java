final class KomputerCetak {
     final void cetak(Komputer[] obj){
          
          Laptop lp = new Laptop();    
          Netbook nk = new Netbook();
          PC pc = new PC();
          
          Komputer[] arr = {lp, nk, pc};
          for(int i=0; i<arr.length; i++){
               arr[i].hidupkan_os();
               arr[i].klik_kiri();
               arr[i].klik_kanan();
               arr[i].tekan_enter();
               arr[i].cetak_data();
               arr[i].matikan_os();
          }
     }
          
          
        public static void main(String[] args) {
        final KomputerCetak ob = new KomputerCetak();
        ob.cetak(null);
        
        
    }
}
    


