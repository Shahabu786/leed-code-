class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String [] args){
        Solution s=new Solution();
        int ar[]={3,2,2,3};
        int a=s.removeElement(ar,3);
        System.out.println(a);
    }

        
    }
