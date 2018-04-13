class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);

        if (beginWord == null || endWord == null
                || beginWord.length() == 0 || endWord.length() == 0
                || beginWord.length() != endWord.length() || !words.contains(endWord)) {
            return 0;
        }

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 0;

        while (!q.isEmpty()) {
            int qSize = q.size();
            level++;

            for (int i = 0; i < qSize; i++) {
                String current = q.poll();
                for (int j = 0; j < current.length(); j++) {
                    char[] stringChar = current.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        stringChar[j] = c;

                        String temp = new String(stringChar);

                        if (endWord.equals(temp)) {
                            return level + 1;
                        }

                        if (words.contains(temp) && !visited.contains(temp)) {
                            visited.add(temp);
                            q.offer(temp);
                        }
                    }
                }
            }
        }
        return 0;
    }
}