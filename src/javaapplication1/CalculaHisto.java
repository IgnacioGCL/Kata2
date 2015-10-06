/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author usuario
 */
public class CalculaHisto {
    
    public static <T>Histogram<T> computeHisto(T[] vector){
        Histogram <T> histogram = new Histogram<>();
        for (T key : vector) {
            histogram.increment(key);
        }
        return histogram;
    }
}
