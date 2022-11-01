import java.util.HashMap;
import java.util.Map;

class roman_integers {
    Map<String, Integer> romanInts = new HashMap<String, Integer>();
    roman_integers() {
        romanInts.put("I", 1);
        romanInts.put("V", 5);
        romanInts.put("X", 10);
        romanInts.put("L", 50);
        romanInts.put("C", 100);
        romanInts.put("D", 500);
        romanInts.put("M", 1000);
    }
    
    public int romanToInt(String s) {
        int sum = 0;
        int len = s.length();
        char[] sToChars = s.toCharArray();
        sum += romanInts.get(sToChars[0]);
        for(int i=1; i<len; i++) {

        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
}