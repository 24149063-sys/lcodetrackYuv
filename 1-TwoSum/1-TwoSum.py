# Last updated: 05/02/2026, 08:36:41
class Solution:
    def twoSum(self, nums, target):
        seen = {}  # value -> index

        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i