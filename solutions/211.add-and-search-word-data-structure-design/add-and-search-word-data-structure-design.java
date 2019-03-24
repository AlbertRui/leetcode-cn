class WordDictionary {
    
    private static final int R = 26;
    private Node root = null;
    
    private static class Node {
        boolean isEnd = false;
        Node[] next = new Node[R];
    }

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Node();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        root = insert(word, root, 0);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(word, root, 0);
    }
    
    /**==========================private methods==========================**/
    
    private Node insert(String word, Node x, int d) {
        if(x == null) x = new Node();
        if(d == word.length()) {
            x.isEnd = true;
            return x;
        }
        char c = word.charAt(d);
        x.next[c - 'a'] = insert(word, x.next[c - 'a'], d + 1);
        return x;
    }
    
    private boolean search(String pat, Node x, int d) {
        if (x == null) return false;
        if (d == pat.length()) return x.isEnd;
        char next = pat.charAt(d);
        boolean ans = false;
        for (char c = 0; c < R; c++)
            if (next == '.' || c == next - 'a')
                ans = ans || search(pat, x.next[c], d + 1);
        return ans;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */