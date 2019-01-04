class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length(), lenB = b.length();
        int tempA = 0, tempB = 0, carry = 0, tempSum = 0;
        StringBuilder result = new StringBuilder();
        while(lenA > 0 || lenB > 0) {
            if(lenA > 0) tempA = a.charAt(--lenA) - '0';
            else tempA = 0;
            if(lenB > 0) tempB = b.charAt(--lenB) - '0';
            else tempB = 0;
            tempSum = tempA + tempB + carry;
            result.insert(0, tempSum % 2);
            carry = tempSum > 1 ? 1 : 0;
        }
        if(carry == 1) result.insert(0, 1);
        return result.toString();
    }
}