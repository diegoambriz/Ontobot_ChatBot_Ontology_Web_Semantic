/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajenatural;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.File;

/**
 *
 * @author Basu
 */
public class Voz implements Runnable {
    private String dir;
    private VoiceManager freettsVM;
    private Voice freettsVoice;
    private String vozNombre = "mbrola_us1";
    private String texto = "Hola, buenas tardes";
   

    @Override
    public void run() {
        reproduceVoz();
    }
    
    private void reproduceVoz() {
        File miDir = new File (".");
        try {
          dir = (miDir.getCanonicalPath() + "\\mbrola");
          }
        catch(Exception e) {
          e.printStackTrace();
       }
        // Most important part!
        System.out.println(dir);
        System.setProperty("mbrola.base", dir);
        freettsVM = VoiceManager.getInstance();

        // Simply change to MBROLA voice
        freettsVoice = freettsVM.getVoice(vozNombre);
        // Allocate your chosen voice
        freettsVoice.allocate();
        sayWords(texto);    
    }
    
    private void sayWords(String words) {
        // Make her speak!
        freettsVoice.speak(words);
    }
    
    public static void main (String [] args) {
        new Thread ( new Voz() , "+").start();
        new Thread ( new Voz() , "-").start();
        new Thread ( new Voz() , ":").start();
        new Thread ( new Voz() , "*").start();
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
 /*
public class ThreadSample implements Runnable 
{
    public void run() 
    {
        for (int i = 0; i < 5000 ; i++) 
            System.out.println(i + " " + Thread.currentThread().getName());
        System.out.println("End of thread " + Thread.currentThread().getName());
    }
    public static void main (String [] args) {
        new Thread ( new ThreadSample() , "+").start();
        new Thread ( new ThreadSample() , "-").start();
        new Thread ( new ThreadSample() , ":").start();
        new Thread ( new ThreadSample() , "*").start();
    }
}
*/
