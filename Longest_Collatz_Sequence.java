import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Longest_Collatz_Sequence {
  /**
   * Iterate through each line of input.
   */
  public static int chainLength(int startingNum) {
    int length = 0;
    while(startingNum != 1) {
        if(startingNum % 2==0)
            startingNum /= 2;
        else   
            startingNum = 3*startingNum+1;
        length++;
    }
    return length;
  }

  public static int findLongestChain(int upperBound) {
    int longest = 0;
    for(int i=0; i<upperBound; i++) {
        int currentLength = chainLength(i);
        if(currentLength > longest) 
            longest = currentLength;
    }
    return longest;
  }
  public static void main(String[] args) throws IOException {
    System.out.println(findLongestChain(100));
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(findLongestChain(Integer.parseInt(line)));
    }
  }
}
