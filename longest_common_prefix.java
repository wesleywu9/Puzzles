// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        char[] prefix = strs[0].toCharArray();
        for(int i=1; i<strs.length; i++) {
            
        }
        return prefix;
    }
    
    public static void main() {
        String[] input = {"abc", "ab"};
        System.out.println(longest_common_prefix.longestCommonPrefix(input));
    }
}
