class Solution {
   public boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) {
            return false;
        }
        int countV = 0;
        int countH = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    countV++;
                    break;
                case 'D':
                    countV--;
                    break;
                case 'L':
                    countH++;
                    break;
                case 'R':
                    countH--;
                    break;
            }
        }
        return countH == 0 && countV == 0;
    }
}