package annotation;


import java.util.ArrayList;
import java.util.List;

public class MetaAnnotations {
//    @Target
//    @Retention
//    @Inherited
//    @Documented
//    @Repeatable

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
