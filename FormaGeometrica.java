public abstract class FormaGeometrica{
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome= nome;
    }
    
    
    abstract double calcularArea();

    public String getNome(){
        return this.nome;
    }
}