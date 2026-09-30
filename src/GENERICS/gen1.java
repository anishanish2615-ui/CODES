package GENERICS;

import java.util.ArrayList;


    class Box<T>{
        private T content;
        void set(T content){
            this.content=content;
        }
        T get(){
            return content;
        }
    }
    public class gen1{
        public static void main(String[] args) {
            Box<String>stringBox=new Box<>();
            stringBox.set("hello");
            System.out.println(stringBox.get());

            Box<Integer>intBox=new Box<>();
            intBox.set(42);
            System.out.println(intBox.get());
        }

    }

