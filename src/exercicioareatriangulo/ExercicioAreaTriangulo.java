package exercicioareatriangulo;

public class ExercicioAreaTriangulo {

 
    public static void main(String[] args) {
       Triangulo triang=new Triangulo();
       triang.setA(4);
       triang.setB(5);
       triang.setC(6);
       
       System.out.println("Area do Triangulo = "+triang.getAreaTriangulo());
    }
    
}
