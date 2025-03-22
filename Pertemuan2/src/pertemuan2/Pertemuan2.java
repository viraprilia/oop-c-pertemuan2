
package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Wihelmina Aprilia
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String mhs="Wihelmina Aprilia Guman";
      long nim=2301010315L;
      String kelas="C";
      
      BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
     
      try{
          System.out.print("Input Nama Mahasiswa: ");
          mhs = dtIN.readLine();
          
          System.out.print("Input NIM:");
          nim = Long.parseLong( dtIN.readLine() );
          
      }catch(IOException e){
          System.out.println("error");
      
      }
      kelas = JOptionPane.showInputDialog("Input Kelas: ");
      
      System.out.println("Data "+mhs+" dengan NIM "+ nim+ " berada di kelas "+kelas);
     
    }
    
}
