
	package PizzaTimer;

	import java.io.File;
import java.util.Scanner;
	//import java.util.logging.Level;
	//import java.util.logging.Logger;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

	/**
	 *
	 * @author Lucas
	 */
	public class PizzaTimer {

	    private Scanner scanMan;


		/**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	    		    	    	
	        PizzaTimer time = new PizzaTimer();
	        time.secondConversionTimer();
	        //time.timerCount();
	    }
	    
	    public int secondConversionTimer(){
	        System.out.println("Enter the amount of time left in seconds");
	        scanMan = new Scanner(System.in); 
	        
	        int secs = scanMan.nextInt();
	        int mins = secs/60;
	        int remainSecs = secs%60;
	        
	        System.out.println("\n" + secs + " Seconds");
	        System.out.println(mins + " Minutes");
	        
	        System.out.println("\n" + "You have started with... ");
	        System.out.println(mins + " mins " + remainSecs + " Seconds" + "\n");
	        
	        for (; secs > 0; secs--){
	            System.out.println("-----------------------------------------------------------------------");
	            mins = secs/60;
	            remainSecs = secs%60;
	            System.out.println("\n" + "Time Remaining: " + mins + " Minutes " + remainSecs + " Seconds");
	            
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException ex) {
	                
	            }
	        }
	        
	            if (secs == 0){
	            System.out.println("\n" + "-----------------------------------------------------------------------");
	            System.out.println("\n" + "Timer is done! Go get some Pizza! :)");
	            
	            // Sound Related Output
	            File memeSound = new File("Spongebob Da Dadadada Dum.wav");
	            playSound(memeSound);
	            
	            }
	        
	        return 0;
	    }
	    
	    static void chooseSound() {
	    	
	    }
	    
	    
	    static void playSound(File Sound){
	    	try {
	    		Clip clip = AudioSystem.getClip();
	    		clip.open(AudioSystem.getAudioInputStream(Sound));
	    		clip.start();
	    		
	    		Thread.sleep(clip.getMicrosecondLength());
	    		
	    	} catch(Exception e) {
	    }
	    	
	  } 
	    
	} // Final Bracket do not delete.


