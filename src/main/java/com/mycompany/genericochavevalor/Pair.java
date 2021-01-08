

/*
 Recebe um par chave/valor e os imprime na tela
 */

package com.mycompany.genericochavevalor;

/**
 *
 * @author Diego
 * @param <K>
 * @param <V>
 */
public class Pair <K,V> {
    K key;
    V value;
    
    public void set (K k, V v){
    key = k;
    value = v;
    }
    
    public K getKey(){
      return key;
    }
    
    public V getValue(){
     return value;
    } 
    
    @Override
    public String toString(){
      return "[" + getKey() + "," + getValue() + "]";
    }
   
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair <String, Integer>();
        pair1.set(" Nome: diego de morais:  Idade =", (32));
        System.out.println(pair1);
        
        Pair<String, Integer> pair2 = new Pair <String, Integer>();
        pair2.set(" Nome: rosalise fernnades barbosa:  Idade =", (30));
        System.out.println(pair2);
        
        Pair<String, Integer> pair3 = new Pair <String, Integer>();
        pair3.set(" Nome: maria isabella fernandes de morais barbosa:  Idade =", (6));
        System.out.println(pair3);
        
        Pair<Float, Long> pair4 = new Pair <Float, Long>();
        pair4.set((3.141590F)  , (1245L));
        System.out.println(pair4);
    }
    
}
    


