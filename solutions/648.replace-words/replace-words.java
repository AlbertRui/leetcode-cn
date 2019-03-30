class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        TrieNode trieNode = new TrieNode();
        for(String word : dict) {
            TrieNode node = trieNode;
            for(char c : word.toCharArray()) {
                if(node.nodes[c - 'a'] == null) 
                    node.nodes[c - 'a'] = new TrieNode();
                node = node.nodes[c - 'a'];
            }
            node.word = word;
        }
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            TrieNode node = trieNode;
            for(char c : words[i].toCharArray()) {
                node = node.nodes[c - 'a'];
                if(node == null) break;
                if(node.word != null) {
                    words[i] = node.word;
                    break;
                }
            } 
        }
        return String.join(" ", words);
    }
    class TrieNode {
        TrieNode[] nodes = new TrieNode[26];
        String word;
    }
}