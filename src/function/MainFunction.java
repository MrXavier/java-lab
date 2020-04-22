package function;

import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

import static java.lang.System.out;

public class MainFunction {

    public void mainFunction() {
        out.println("functionBiFunction " + biFunction("100","2"));
    }

    private Integer biFunction(String a1, String b1){
        BiFunction<String, String, Integer> strToInt = (a, b) -> Integer.parseInt(a + b);
        return strToInt.apply(a1, b1);
    }

    private Integer toIntFunction(){
        ToIntFunction f2 = value -> 1;
        int integer = f2.applyAsInt("");
        return integer;
    }
}
