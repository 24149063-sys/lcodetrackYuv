// Last updated: 05/02/2026, 08:36:02
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0)
            return true;
        return num % 10 != 0;
    }
}