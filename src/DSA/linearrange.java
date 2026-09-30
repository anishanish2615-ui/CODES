package DSA;

import java.util.Scanner;

public class linearrange {
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6,7,8,9};
        int target=4;
        int ans= rangelinear(nums,target,0,nums.length-1);
        System.out.println(ans);


    }
    static int rangelinear(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            if (arr[index]==target){
                return index;
            }

        }
        return -1;
    }

}
