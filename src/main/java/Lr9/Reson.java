package Lr9;

public abstract class Reson {
    private String n;
    private int a;
    private String k;

    public abstract void test();
    public void test2(){
    }
    public Reson(String n, int a,String k){
        this.k = k;
        this.n = n;
        this.a = a;
    }
    //Reson res = new Forward();
}
