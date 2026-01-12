class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        num = 0

        for n in nums:
            num = n ^ num

        bit_on = 0
        for bit in range(32):
            if num & (2**bit):
                bit_on = bit
                break

        num_off = 0
        num_on = 0
        for n in nums:
            if n & (2**bit_on):
                num_on = num_on ^ n
            else:
                num_off = num_off ^ n

        return [num_off, num_on]

