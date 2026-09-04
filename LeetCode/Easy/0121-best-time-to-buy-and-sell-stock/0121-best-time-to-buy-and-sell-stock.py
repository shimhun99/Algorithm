class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # """
        # 브루트 포스
        # time: O(n^2)
        # space: O(1)
        # """ 
        # profit = 0

        # for i in range(len(prices)):
        #     for j in range(i+1, len(prices)):
        #         if prices[i] < prices[j]:
        #             profit = max(profit, prices[j] - prices[i])

        # return profit

        """
        time: O(n)
        space: O(1)
        """

        max_profit, min_price = 0, prices[0]

        for price in prices:
            max_profit = max(max_profit, price-min_price)
            min_price = min(min_price, price)
        return max_profit