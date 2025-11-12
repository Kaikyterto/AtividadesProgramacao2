public class Quadrado extends FormaBidimensional{
     double lado;

    

    public Quadrado(String nome, double lado) {
        super(nome, lado, lado);
        this.lado= lado;
        
    }
    @Override
    public double calcularArea(){
        return (lado*lado);
    };

    @Override
    public double calcularPerimetro(){
        return(4*lado);
    }
}
