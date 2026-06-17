class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<candies.length; i++){
            int now = candies[i]+extraCandies;
            int cnt = 0;

            for(int j=0; j<candies.length; j++){
                if(i==j) continue;
                if(now < candies[j]){
                    result.add(false);
                    break;
                }
                cnt++; 
            }

            if(cnt == candies.length-1) result.add(true);
        }
        
        return result;
    }
}