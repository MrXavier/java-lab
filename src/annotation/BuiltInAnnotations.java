package annotation;

import java.util.ArrayList;
import java.util.List;

public class BuiltInAnnotations {
//    @Override
//    @SuppressWarnings
//    @Deprecated
//    @SafeVarargs
//    @FunctionalInterface

    public String toString(){
        return "";
    }

    @SuppressWarnings({"unchecked"})
    public void suppressWarning(){
        List a = new ArrayList();
        a.add("");
    }

    @Deprecated
    public String deprecated(){
        return "";
    }

}
