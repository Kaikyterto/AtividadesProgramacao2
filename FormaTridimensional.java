public abstract class FormaTridimensional extends FormaGeometrica{
    double largura;
    double altura;
    double comprimento;
    public FormaTridimensional(String nome,double largura,double altura,double comprimento) {
        super(nome);
        this.largura= largura;
        this.altura= altura;
        this.comprimento= comprimento;
    }
    
    abstract double calcularVolume();
}
