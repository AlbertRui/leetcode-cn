class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cntFive = 0, cntTen = 0;
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) cntFive++;
            else if(bills[i] == 10) {
                cntTen++;
                cntFive--;
            } else {
                if(cntTen > 0) {
                    cntTen--;
                    cntFive--;
                } else cntFive -= 3;
            }
            if(cntFive < 0) return false;
        }
        return true;
    }
}