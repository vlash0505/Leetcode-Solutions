class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(!s.contains(" ")) return s.length();
        StringBuilder b = new StringBuilder(s);
        return ((b.length() - 1) - b.lastIndexOf(" "));
    }
}