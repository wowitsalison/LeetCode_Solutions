class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        same = 1
        k = 1

        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                same +=1
            else:
                same = 1

            if same < 3:
                nums[k] = nums[i]
                k+=1

        return k
