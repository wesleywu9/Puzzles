import java.util.HashMap;
import java.util.Map;

class roman_integers {
    
    public int romanToInt(String s) {
        Map<Character, Integer> romanInts = new HashMap<Character, Integer>();
        romanInts.put('I', 1);
        romanInts.put('V', 5);
        romanInts.put('X', 10);
        romanInts.put('L', 50);
        romanInts.put('C', 100);
        romanInts.put('D', 500);
        romanInts.put('M', 1000);
        int sum = 0;
        char[] arr = s.toCharArray();
        int curr, next;
        for(int i=0; i<arr.length; i++) {
            curr = romanInts.get(arr[i]);
            if(i==arr.length-1) 
                return sum += curr;
            next = romanInts.get(arr[i+1]);
            if(curr<next) {
                sum += next-curr;
                i += 1;
            }
            else
                sum += curr;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new roman_integers().romanToInt("XXVII"));
    }
}