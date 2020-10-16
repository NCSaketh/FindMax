package com.cg.findmax;

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

    public static <G extends Comparable<G>> G FindMaxGeneric(G[] array) {
        G max = array[0].compareTo(array[1]) > 0 ? array[0] : array[1];
        return max.compareTo(array[2]) > 0 ? max : array[2];
    }

    public static void main(String[] args) {

        GenericMax G=new GenericMax();
    }


}
