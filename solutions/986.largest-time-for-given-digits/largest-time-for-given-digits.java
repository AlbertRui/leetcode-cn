class Solution {
    public String largestTimeFromDigits(int[] A) {
        Queue<String> queue = new LinkedList<>();
        queue.add("");
        String curStr = "";
        for(int num : A) {
            for(int size = queue.size(); size > 0; size--) {
                curStr = queue.remove();
                for(int i = 0; i <= curStr.length(); i++) 
                    queue.offer(curStr.substring(0, i) + num + curStr.substring(i));
            }
        }
        String res = "";
        for(String curRes : queue) {
            curRes = curRes.substring(0, 2) + ":" + curRes.substring(2);
            if (curRes.charAt(3) < '6' && curRes.compareTo("24:00") < 0 && curRes.compareTo(res) > 0)
                res = curRes;
        }
        return res;
    }
}