package basics;

import java.math.BigDecimal;

public class Object extends java.lang.Object {
    int i;
    float f;
    String str;
    BigDecimal bd;

    public Object() { }

    public Object(int i, float f, String str, BigDecimal bd){
        this.i = i;
        this.f = f;
        this.str = str;
        this.bd = bd;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

}
