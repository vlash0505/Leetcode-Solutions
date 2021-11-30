class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(!s.contains(" ")) return s.length();
        return ((s.length() - 1) - s.lastIndexOf(" "));
    }
}
