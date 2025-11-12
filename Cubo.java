public class Cubo extends FormaTridimensional {
    double lado;
    public Cubo(String nome,double lado) {
        super(nome,lado,lado,lado);
        this.lado= lado;
    }

    @Override
    public double calcularVolume(){
        return (lado*lado*lado);
    };

    @Override
    public double calcularArea(){
        return ((lado*lado)*6);
    };
    
}
