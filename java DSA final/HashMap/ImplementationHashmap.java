package HashMap;

import java.util.LinkedList;

public class ImplementationHashmap {
    static class HashMap<K,V>{ // generic type
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value= value;
            }
        }
            private int size;
            private int arr[];
            private LinkedList<Node>buckets[];
            @SuppressWarnings("unchecked")
            public HashMap(){
                this.size=0;
                this.buckets= new LinkedList[4];
                for(int i=0;i<4;i++){
                    this.buckets[i]= new LinkedList<>();
                      
                }
                public void put(K key,V value){
                      
                }
            }
        

    }
}
