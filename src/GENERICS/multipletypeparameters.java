package GENERICS;

public class multipletypeparameters {
    public static void main(String[] args) {
        class pair<K,V>{
            K key;
            V value;

            pair(K key, V value){
                this.key=key;
                this.value=value;

            }
            public String toString() {
                return key + "=" + value;
            }
        }
        pair<String,Integer>age=new pair<>("anish",28);
        System.out.println(age);
    }
}

