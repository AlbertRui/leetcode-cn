class Solution {
    public static String convert(String s, int numRows) {
        //字符串为空则直接返回
        if (s == null || s.isEmpty()) {
            return s;
        }
        int length = s.length();
        //字符串长度不大于行数或者行数为1时，直接返回
        if (length <= numRows || numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        //首行和尾行相邻两个元素之间的距离
        int step = 2 * numRows - 2;
        //统计字符已添加个数
        int count = 0;
        //逐行添加，行数从零开始计算
        for (int i = 0; i < numRows; i++) {
            //其他行除了像首末两行一样有间隔距离2*(numRows - 1)的元素，
            // 在它们之间还有一个元素，该元素到该行下一个元素的距离为2*i，i为所在行数，
            // 所以可知固定间隔位置到下一个元素的距离为2*(numRows -1) - 2*i，即step - interval;
            int interval = step - 2 * i;
            for (int j = i; j < s.length(); j += step) {
                sb.append(s.charAt(j));
                count++;
                //interval > 0 排除末行，interval < step 排除首行
                if (interval > 0 && interval < step && j + interval < length && count < length) {
                    sb.append(s.charAt(j + interval));
                    count++;
                }
            }
        }
        return sb.toString();
    }
}