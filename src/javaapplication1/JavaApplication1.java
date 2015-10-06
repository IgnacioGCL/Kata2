
package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

  
    
    
    public static void main(String[] args) {
        int[] vector = {2,2,11,4,2,6,11,2,3,5,11,5};
        String[] names = {"Ana", "Juan", "Pepe", "Ana", "Juan"};
        Histogram histo = new Histogram(vector);
        HashMap<Integer,Integer> histograma = histo.getHistogram();
        
        for (Integer key: histograma.keySet()) {
            System.out.println("El elemento: " + key + ", se repite: " +histograma.get(key) + " veces.");
        }
    }
}
