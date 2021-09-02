package exercicioareatriangulo;


public class Triangulo {
    private int a;
    private int b;
    private int c;

   
    public void setA(int x) {
        this.a = x;
    }
    
    public void setB(int x) {
        this.b = x;
    }
    
     public void setC(int x) {
        this.c = x;
    }
    
    public double getAreaTriangulo(){
        if(a<0 || b<0 || c<0){
            return 0;
        }
        int p = (a+b+c)/2;
        int soma = p*(p-a)*(p-b)*(p-c);
        double areaTriang = Math.sqrt(soma);
        return areaTriang;
    }
}
