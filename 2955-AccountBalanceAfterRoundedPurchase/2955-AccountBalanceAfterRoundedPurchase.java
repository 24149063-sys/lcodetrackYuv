// Last updated: 05/02/2026, 08:35:57
class Solution {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int cut = Math.round(purchaseAmount / 10.0f) * 10; // round to nearest multiple of 10
        return 100 - cut; // subtract from initial balance
    }
}