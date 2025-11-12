public abstract class FormaBidimensional extends FormaGeometrica{
    abstract double calcularPerimetro();
    double altura;
    double comprimento;


    public FormaBidimensional(String nome,double altura,double comprimento) {
        super(nome);
        this.altura= altura;
        this.comprimento= comprimento;
    }

    
}
