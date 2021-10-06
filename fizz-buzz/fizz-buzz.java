class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String toPaste = "";
            if(i % 3 == 0) {
                toPaste = toPaste + "Fizz";
            }
            if(i % 5 == 0) {
                toPaste = toPaste + "Buzz";
            }
            if(toPaste.length() == 0) {
                toPaste = toPaste + Integer.toString(i);
            }            
            result.add(toPaste);
        }
        return result;
    }
}