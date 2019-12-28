TC:O(n)
SC:O(1)


Approach: We find the maximum index to which we can jump at every point. If the current point is greater than the max index, then it 
means we cannot jump to the current point and return false, else return true;

class Solution {
    public boolean canJump(int[] ratings) {
        
        int index = ratings.length-1;
        for(int i=index-1;i>=0;i--){
            if(ratings[i]+i>= index) index = i;
        }
    
        return index==0? true:false;   
    }
}
