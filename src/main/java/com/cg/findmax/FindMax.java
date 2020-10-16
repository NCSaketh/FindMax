package com.cg.findmax;

public class FindMax {



    public static void main(String[] args) {
        FindMax m=new FindMax();
        System.out.println("Welcome to find the maximum ");
    }


    public static Integer FindMaxInt(Integer a, Integer b, Integer c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public static Float FindMaxFloat(Float a, Float b, Float c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public static String FindMaxString(String a, String b, String c)
    {
        if(a.compareTo(b)>0&&a.compareTo(c)>0){
            return a;
        }
        else if(b.compareTo(a)>0&&b.compareTo(c)>0){
            return b;
        }
        else {
            return c;
        }
    }

    public static <G extends Comparable<G>> G FindMaxGeneric(G a, G b, G c)
    {
        if (a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        else
            return c;
    }
}


