
package javaapplication1;

import java.util.HashMap;


public class Histogram {

    private final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
    
    public HashMap<Integer,Integer> getHistogram(){
        HashMap<Integer,Integer> histograma = new HashMap<>();
        for (int i = 0; i < vector.length; i++) {
            if(!histograma.containsKey(vector[i])){
                histograma.put(vector[i],1);
            }else{
                histograma.put(vector[i],histograma.get(vector[i])+1);
            }
        }
        return histograma;
    }
}
