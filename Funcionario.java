import java.util.ArrayList;

public class Funcionario {
   
    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome ,String cpf,double salario,String dataNascimento){
        this.nome= nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento= dataNascimento;
        
        
    }

    public String getcpf(){
        return cpf;
    }

    public double getsalario(){
        return salario;
    }

    public String getdataNascimento(){
        return dataNascimento;
    }

    public void setsalario(double salario){
        this.salario= salario;
    }

    public String getnome(){
        return nome;
    }

    public static int quantidadeFuncionarios(){
        return funcionarios.size();
    }

    public static void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getnome());
        }
    }

}

