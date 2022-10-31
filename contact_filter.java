import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class contact_filter {
  /**
   * Iterate through each line of input.
   */

  public static String[] filter(String[] contracts, char month) {
    String[] filtered_contracts = new String[1000];
    int fIndex=0;
    for(int i=0; i<contracts.length; i++) {
        for(char currentChar : contracts[i].toCharArray()) {
            if(currentChar == month)
                filtered_contracts[fIndex] = contracts[i];
        }
    }
    return filtered_contracts;
  }
  public static void main(String[] args) throws IOException {
    // input: string of comma-separated contracts. Last month is the filter.
    // e.g. "GEM6,CZ22,USH2,TYFZ2021,3Z23,Z"
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {

      System.out.println(line);
    }
  }
}
