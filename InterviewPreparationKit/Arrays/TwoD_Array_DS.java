import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    
    /* Solution */
    public static int hourglassSum(List<List<Integer>> arr) {
       Integer sum;
       List<Integer> sum_array = new ArrayList<>();  
        for(int x =0;x<arr.size()-2;x++){
            for(int y=0;y<arr.get(x).size()-2;y++){
                     sum = arr.get(x).get(y) + arr.get(x).get(y+1) + arr.get(x).get(y+2) 
                                            + arr.get(x+1).get(y+1) 
                         + arr.get(x+2).get(y) + arr.get(x+2).get(y+1) + arr.get(x+2).get(y+2) ;
              sum_array.add(sum);
            }    
        }
        
        Integer result = Collections.max(sum_array);
        return result;
    }
    /* Solution */
}

public class TwoD_Array_DS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
