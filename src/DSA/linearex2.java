package DSA;

public class linearex2 {
    public static void main(String[] args) {
        String[] str={"anish","ani","harren"};
        //String target="anish";
        String target=str[0];
        boolean ans=linear(str, target);
        System.out.println(ans);


    }

    static boolean linear(String[] arr, String target) {
        if (arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                return true;
            }
        }
        return false;
    }
}
