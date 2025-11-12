import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<FormaBidimensional> formas2D = new ArrayList<>();
        ArrayList<FormaTridimensional> formas3D = new ArrayList<>();
    
        Retangulo r = new Retangulo("r", 2, 3);
        Quadrado q = new Quadrado("q", 2);
        Circulo c = new Circulo("c", 2);
        Cubo cubo = new Cubo("cubo", 3);
    
        formas2D.add(r);
        formas2D.add(q);
        formas2D.add(c);

        formas3D.add(cubo);

    
        for (FormaBidimensional f : formas2D) {
            String nome= f.getNome();
            double area= f.calcularArea();
            double perimetro= f.calcularPerimetro();
    
            System.out.println("Nome: "+nome+" área: "+area+" perímetro: "+perimetro);
        }

        for (FormaTridimensional f : formas3D) {
            String nome= f.getNome();
            double area= f.calcularArea();
            double volume= f.calcularVolume();
    
            System.out.println("Nome: "+nome+" área: "+area+" volume: "+volume);
        }
          
    }
    

}
