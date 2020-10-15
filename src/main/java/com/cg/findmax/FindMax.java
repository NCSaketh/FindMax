package com.cg.findmax;

public class FindMax {

    public static void main(String[] args) {
        FindMax m=new FindMax();
    }

    public Integer FindMax(Integer a,Integer b,Integer c)
    {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }


}


