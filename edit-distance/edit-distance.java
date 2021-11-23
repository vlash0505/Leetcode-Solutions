class Solution {
    public int minDistance(String word1, String word2) {
        //initializing distance cache matrix
        int[][] dist = new int[word1.length() + 1][word2.length() + 1];
        //filling the base cases
        IntStream.range(0, Math.max(dist.length, dist[0].length))
                 .forEach(i -> { if(i < dist.length) dist[i][0] = i;
                                 if(i < dist[0].length) dist[0][i] = i; });
        
        for(int i = 1; i < word1.length() + 1; i++) {
            for(int j = 1; j < word2.length() + 1; j++) {
                dist[i][j] = Math.min(Math.min(dist[i - 1][j - 1], 
                                               dist[i][j - 1]), 
                                               dist[i - 1][j]);                
                
                dist[i][j] = (word1.charAt(i - 1) != word2.charAt(j - 1)) ? dist[i][j] + 1 :
                dist[i - 1][j - 1];
            }
        }
        return dist[word1.length()][word2.length()];
    }
}