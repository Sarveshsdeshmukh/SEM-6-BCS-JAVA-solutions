import java.util.Timer;
import java.util.TimerTask;
public class AlphabetDisplay {
 private static char currentAlphabet = 'A';
 public static void main(String[] args) {
 Timer timer = new Timer();
 TimerTask task = new TimerTask() {
 @Override
 public void run() {
 System.out.println(currentAlphabet + " ");
 currentAlphabet++;
 if (currentAlphabet > 'Z') {
 timer.cancel();
 }
 }
 };
 timer.scheduleAtFixedRate(task, 0, 2000);
 }
} 
