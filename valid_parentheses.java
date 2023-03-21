/*
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
*/

public class valid_parentheses {
    public boolean check_parentheses(String input) {
        char[] char_arr = input.toCharArray();
        for(int i=0; i<char_arr.length; i++) {
            switch(char_arr[i]) {
                case ')':
                    if(char_arr[i-1] != '(')
                        return false;
                case ']':
                    if(char_arr[i-1] != '[')
                        return false;
                case '}':
                    if(char_arr[i-1] != '{')
                        return false;
            }
        }
        return true;
    }
}
