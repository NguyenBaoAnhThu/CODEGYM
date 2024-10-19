package Exception.Demo;

public class Calculator {
    public Calculator (){}

    public int add (int a , int b ){
        return a+b;
    }
    public int subtract (int a , int b ){
        return a - b ;
    }
    public int mutiply(int a , int b){
        return a*b;
    }
    public float divide(int a , int b) throws Exception{
        if (b==0){
            throw new Exception("Divide the zero");
        }
        return (float) a/b;
    }
}
