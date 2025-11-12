public class Circulo extends FormaBidimensional{
    double raio;
    final double pi= 3.14;

    

    public Circulo(String nome,double raio) {
        super(nome, 2*raio, 2*raio);
        this.raio=raio;
    }

    @Override
    public double calcularArea(){
        return (pi*raio*raio);
    };

    @Override
    public double calcularPerimetro(){
        return(pi*comprimento);
    }
}

