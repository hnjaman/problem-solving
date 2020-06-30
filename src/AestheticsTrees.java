public class AestheticsTrees {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,3,2,6};
//        int[] nums = new int[]{3,7,4,5,6};
        int flag=0;
        boolean found1 = false;
        boolean found2 = false;

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                flag = i;
                break;
            } else if(nums[i] > nums[i+1]){
                if(!found1){
                    found1 = true;
                } else {
                    flag = i;
                    break;
                }
                if(found2){
                    found2 = false;
                }
            } else {
                if(!found2){
                    found2 = true;
                } else {
                    flag = i;
                    break;
                }

                if(found1){
                    found1 = false;
                }
            }
        }

        System.out.println(flag);
    }
}
