class Solution {
    static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder hexs = new StringBuilder();
        while(num != 0) {
            hexs.append(digits[num & 0xf]);
            num = num >>> 4;
        }
        return hexs.reverse().toString();
    }
}