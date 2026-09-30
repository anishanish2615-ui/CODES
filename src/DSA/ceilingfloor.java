package DSA;

public class ceilingfloor {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,11,13,26};
        int target=12;
        int ceilingindex=ceiling(nums,target);
        int floorindex=floor(nums,target);

        System.out.println("target "+target);

        if(ceilingindex != -1){
            System.out.println("ceiling "+ceilingindex);
        }else{
            System.out.println("ceiling index not found");
        }

        if(floorindex != -1){
            System.out.println("floor "+floorindex);
        }else{
            System.out.println("floor index not found");
        }



    }
    static int ceiling(int[]arr,int target){

        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;

            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
            return start;
    }
    static int floor(int[]arr,int target){

        if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;

            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
