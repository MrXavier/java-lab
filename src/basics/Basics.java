package basics;


import static java.lang.String.format;

public class Basics {

    public void finalKeyword(){
        final int i = 2;
//        i = 9; error
        final String s = " This is a String.   ";
//        s = "asd"; error
        System.out.println("s = " + s);
        System.out.println(format("s.toUpperCase() = %s because it returns a new String", s.toUpperCase()) );
        System.out.println("s is still = " + s);

        System.out.println("Other methods that change the string returns a new String so the original is not affected");

        Object o = new Object();
        System.out.println(o);
    }
}
