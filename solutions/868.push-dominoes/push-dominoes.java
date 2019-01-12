class Solution {
    public String pushDominoes(String dominoes) {
        char[] dominArr = dominoes.toCharArray();
        for (int i = 0; i < dominArr.length; i++) {
            if (dominArr[i] == 'L') {
                for (int j = i - 1; j >= 0; j--) {
                    if (dominArr[j] == '.') {
                        dominArr[j] = 'L';
                    } else {
                        break;
                    }
                }
            } else if (dominArr[i] == 'R') {
                int Lindex = dominoes.indexOf('L', i+1);
                if (Lindex == -1) {
                    for (int j = i + 1; j < dominArr.length; j++) 
                        dominArr[j] = 'R';
                    break;
                } else {
                    int Rindex=0, j = Lindex - 1;
                    while(true) {
                        if (dominArr[j] == 'R') {
                            Rindex = j;
                            break;
                        }
                        j--;
                    }
                    while(i < Rindex) dominArr[i++] = 'R';
                    j = Lindex;
                    while (i < j) {
                        dominArr[i++] = 'R';
                        dominArr[j--] = 'L';
                    }
                    i = Lindex;
                }
            }
        }
        return new String(dominArr);
    }
}