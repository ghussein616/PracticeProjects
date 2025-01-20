public class Solution {
    /**
     * @param s the Roman numeral string
     * @return the integer equivalent of the Roman numeral
     */
    public int romanToInt(String s) {
        // Mapping of Roman numerals to integer values
        int[] romanValues = new int[128];
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;

        int result = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // If the current symbol is less than the next one, subtract it
            if (i + 1 < s.length() && romanValues[s.charAt(i)] < romanValues[s.charAt(i + 1)]) {
                result -= romanValues[s.charAt(i)];
            } else {
                result += romanValues[s.charAt(i)];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.romanToInt("III"));      // Output: 3
        System.out.println(solution.romanToInt("LVIII"));    // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV"));  // Output: 1994
    }
}
