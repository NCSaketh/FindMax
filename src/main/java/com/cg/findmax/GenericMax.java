package com.cg.findmax;

import java.util.ArrayList;
import java.util.Collections;

public class GenericMax<G> {

    static class MaxTestInput<G extends Comparable<G>> {
        G[] array;

        public MaxTestInput(G[] array) {
            this.array = array;
        }

        public G testMaximum() {
            return GenericMax.FindMaxGeneric(array);
        }
    }

    public static <G extends Comparable<G>> G FindMaxGeneric(G...items) {
        G max=items[0];
        ArrayList<G> array=new ArrayList();
        for(G i:items) {
            array.add(i);
        }
        Collections.sort(array);
        return array.get(array.size()-1);
    }

    public static void main(String[] args) {

        GenericMax G=new GenericMax();
    }


}
