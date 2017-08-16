
/**
 * kelas ini digunakan untuk proses running thread
 * @author andirarozawati 
 * @version 28/04/2016
 */



public class tes {
   public static void main(String args[]) {
   
      LombaHitung task1 = new LombaHitung( "Tomi ");
      task1.start();
      
      LombaHitung task2 = new LombaHitung( "Tomo ");
      task2.start();
      
      LombaHitung task3 = new LombaHitung( "Toma ");
      task3.start();
   }   
   
}