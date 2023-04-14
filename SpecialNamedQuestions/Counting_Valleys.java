import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
     
     public static int depth;
     public static String sub_path;
      public static int valleys;

    public static int countingValleys(int steps, String path) {
    // Write your code here
      
      
      
       
      for(int a = 0;a<steps;a++){
          if(path.charAt(a)=='U'){
              
              depth -=1;
              
          }else if(path.charAt(a)=='D'){
              if(depth==0){
                  valleys +=1;
              }
              depth +=1;
              
              
          }
          
          
      }
          
      
      
      
      
      return valleys;
      

    }

}

public class Counting_Valleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
