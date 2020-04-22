package basics;


import static java.lang.String.format;
import static java.lang.System.out;

public class Basics {

    public void finalKeyword(){
        final int i = 2;
//        i = 9; error
        final String s = " This is a String.   ";
//        s = "asd"; error
        out.println();
        out.println(format("s.toUpperCase() = %s because it returns a new String", s.toUpperCase()) );
        out.println("s is still = " + s);

        out.println("Other methods that change the string returns a new String so the original is not affected");

        Object o = new Object();
        out.println(o);
    }
}
