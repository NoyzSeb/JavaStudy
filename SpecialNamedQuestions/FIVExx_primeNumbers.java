import java.io.*;
import java.util.ArrayList;

public class FIVExx_primeNumbers{
    
    static final int start=100;
    static final int end=1000;
    static boolean prime;
    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> starts_with_five_list=new ArrayList<>();

    static ArrayList<Integer> prime_list_creator(int start, int end){
       int[] two_digit_primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
       for(int i=start; i<end;i++){
           
        for(int y=0;y<two_digit_primes.length;y++){
            
            if(i%two_digit_primes[y]==0){
               prime=false;
               break;
            }else{
                prime=true;
             }
           } 
           
           if(prime){
              list.add(i);
              if(500<i&&i<600)
                starts_with_five_list.add(i);
           }
        }
        
        System.out.println("Full list between 100-1000 \n"+list+"\n"+"Size of List "+list.size()+"\n\nStarting with 5");

        return starts_with_five_list;
    }
    public static void main(String[] args){
        ArrayList<Integer> listed=prime_list_creator(start, end);
        
        System.out.println(listed+"\n"+"Size of List "+listed.size());
    }

}