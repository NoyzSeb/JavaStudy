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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */
     public static int count;
    public static int makeAnagram(String a, String b) {
       int result;
       int alength=a.length();
       int blength=b.length();


        
        if(a.length()>=b.length()){
            for(int i=0; i<b.length();i++){
              if(a.contains(""+b.charAt(i))){
                  count++;
                  a=a.replaceFirst(""+b.charAt(i),"");
              }
              

            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(count);
            result=(blength+alength) - (count*2);
            return result;

        }else{
            for(int i=0; i<a.length();i++){
               if(b.contains(""+a.charAt(i))){
                  count++;
                  b=b.replaceFirst(""+a.charAt(i),"");
              }
            }

           }
           System.out.println(a);
           System.out.println(b);
           System.out.println(count);


           result=(blength+alength) - (count*2);
           return result;   
        } 

    }



public class MakingAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
