package DSA;

import java.util.Arrays;

public class cyclicsort1 {
    public static void main(String[] args) {
        int[]arr={3,4,5,1,2,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;

            }

        }
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
