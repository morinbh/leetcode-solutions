class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        pos_res = 0
        neg_res = 0
        for bit in range(32):
            pos_curr = 0
            neg_curr = 0
            for n in nums:
                if n > 0 and n & (2 ** bit):
                    pos_curr += 1
                if n < 0 and -n & (2 ** bit):
                    neg_curr += 1
            pos_res += (pos_curr % 3) * (2 ** bit)
            neg_res += (neg_curr % 3) * (2 ** bit)
        return pos_res - neg_res
