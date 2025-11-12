public class Retangulo extends FormaBidimensional{

    public Retangulo(String nome,double altura,double comprimento) {
        super(nome, altura, comprimento);
    }

    @Override
    public double calcularArea(){
        return (comprimento*altura);
    };

    @Override
    public double calcularPerimetro(){
        return((2*comprimento)+(2*altura));
    }
}

