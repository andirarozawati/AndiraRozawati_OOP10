import java.util.*;

/**
 * kelas ini digunakan untuk proses pembuatan thread 
 * @author andirarozawati 
 * @version 28/04/2016
 */


public class LombaHitung implements Runnable {
   private Thread t;
   private String nama;
   
   LombaHitung( String name){
       nama = name;
       System.out.println(nama + " hadir "  );
   }
   
   public void run() {
      System.out.println(nama + " mulai menghitung "  );
      try {
         for(int i = 0; i <= 23; i++) {
            System.out.println("kontestan " + nama + " menghitung, " + i);
            // Let the thread sleep for a while.
            Thread.sleep((long)(Math.random() * 100));
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  nama + " interrupted.");
     }
     System.out.println("kontestan " +  nama + " selesai menghitung.");
   }
   
   public void start ()
   {
      System.out.println(nama + " bersiap " );
      if (t == null)
      {
         t = new Thread (this, nama);
         t.start ();
      }
   }

}

