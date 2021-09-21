class Solution {
    public String intToRoman(int num) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC","CM"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] nums = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
    String result = thousands[num / 1000] + hundreds[(num % 1000)/100] + tens[(num % 100) / 10] + nums[num % 10];
        return result;
    }
}