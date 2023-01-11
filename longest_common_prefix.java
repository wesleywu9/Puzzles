/*
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl" 
*/

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        int maxLen=strs[0].length(), len;
        for(String str : strs) {
            len = str.length();
            if(len<maxLen)
                maxLen = len;
        }
        StringBuilder prefix = new StringBuilder();
        int strIdx=0, charIdx=0;
        while(charIdx < maxLen) {
            boolean testPassed = true;
            char test = strs[0].charAt(charIdx);
            for(strIdx=1; strIdx<strs.length; strIdx++) {
                if(strs[strIdx].charAt(charIdx) != test) {
                    testPassed = false;
                    break;
                } 
            }
            if(testPassed == false)
                break;
            prefix.append(test);
            charIdx++;
        }
        return prefix.toString();
    }
    public static void main(String args[]) {
        String[] input = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }
}

