class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> numConv = new HashMap();
        numConv.put('I', 1);
        numConv.put('V', 5);
        numConv.put('X', 10);
        numConv.put('L', 50);
        numConv.put('C', 100);
        numConv.put('D', 500);
        numConv.put('M', 1000);
        
        for(int i = 0; i < s.length(); i++) {
            if(i > 0 && (numConv.get(s.charAt(i)) > numConv.get(s.charAt(i - 1)))) {
                result += numConv.get(s.charAt(i)) - 2 * numConv.get(s.charAt(i - 1));
            } else {
                result += numConv.get(s.charAt(i));                
            }
        }
        return result;
    }
}