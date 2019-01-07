class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<Integer>();
        int fact[] = new int[n];
        fact[0] = 1;
        for(int i = 1; i < n; i++) {
            num.add(i);
            fact[i] = i * fact[i - 1];
        }
        num.add(n);
        k--;
        StringBuilder res = new StringBuilder();
        for(int i = n; i > 0; i--) {
            int index = k / fact[i - 1];
            k = k % fact[i - 1];
            res.append(num.get(index));
            num.remove(index);
        }
        return res.toString();
    }
}