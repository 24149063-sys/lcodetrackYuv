// Last updated: 05/02/2026, 08:36:01
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime+delayedTime)%24;
    }
}