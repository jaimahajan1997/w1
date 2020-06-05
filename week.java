import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public class week5 {
public static void main(String[] args) throws Exception {
	 ArrayList<ques> questionList = new ArrayList<ques>();
	 questionList.add(new ques("Who is the President of India?", "Donald Trump", "Ramnath Kovind","Narendra Modi", "None", "Ramnath Kovind"));
     
     try {
         while (true) {
        	 System.out.println("Q1:Who is president of India?");
             System.out.println("a.Donald Trump b.Ramnath Kovind c.Narendra Modi d.None");
             System.out.println("Enter a,b,c,or d");   
             Scanner s = new Scanner(System.in);

             FutureTask<String> task = new FutureTask<>(() -> {
                 return s.next();
             });

             Thread thread = new Thread(task);
             thread.setDaemon(true);
             thread.start();
             String ans = task.get(10, TimeUnit.SECONDS);
             if(ans.equals("b")) {
                 System.out.println("Correct!");

             }
             else{
                 System.out.println("Incorrect!");

             }
         }
     } catch (TimeoutException interruptedException) {
         System.out.println("TIMEOUT!!");
         System.exit(0);
     }
}
}
