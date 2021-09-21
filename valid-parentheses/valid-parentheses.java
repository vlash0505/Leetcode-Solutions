class Solution {
    public static boolean isValid(String str) {    
    Map<Character, Character> bracketsMap = new HashMap<>();
    bracketsMap.put('(', ')');
    bracketsMap.put('{', '}');
    bracketsMap.put('[', ']');

    Stack<Character> parentheses = new Stack<>();
    for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(bracketsMap.containsKey(c)) {
            parentheses.push(c);  
        } else {
            if(parentheses.isEmpty()) {
                return false;
            }
            char target = parentheses.pop();
            if(!bracketsMap.containsKey(target) || bracketsMap.get(target) != c) {
                return false;
            }
        }
    }
    if(!parentheses.isEmpty()) {
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isValid("([)]"));
  }
}