import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;

        do{
        System.out.println("------MENU ESCRITóRIO------");
        System.out.println("Digite 1 para adicionar gerente");
        System.out.println("Digite 2 para adicionar atendente");
        System.out.println("Digite 3 para listar todos os funcionários");
        System.out.println("Digite 4 para mostrar salario de um funcionário");
        System.out.println("Digite 5 sair");
             numero = sc.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Digite o nome do gerente: ");
                    String nomeGerente= sc.next();
                    System.out.println("Digite o cpf do gerente: ");
                    String cpfGerente= sc.next();
                    System.out.println("Digite o salario do gerente: ");
                    double salarioGerente= sc.nextDouble();
                    System.out.println("Digite a data de nascimento do gerente: ");
                    String dataNascimentoGerente= sc.next();
                    Gerente gerente = new Gerente(nomeGerente, cpfGerente, salarioGerente, dataNascimentoGerente);
                    Funcionario.funcionarios.add(gerente);
                    System.out.println("O gerente "+(gerente.getnome())+" foi adicionado");
                    break;

                case 2:
                    System.out.println("Digite o nome do atendente: ");
                    String nomeAtendente= sc.next();
                    System.out.println("Digite o cpf do atendente: ");
                    String cpfAtendente= sc.next();
                    System.out.println("Digite o salario do atendente: ");
                    double salarioAtendente= sc.nextDouble();
                    System.out.println("Digite a data de nascimento do atendente: ");
                    String dataNascimentoAtendente= sc.next();
                    System.out.println("Digite a comissão: ");
                    double comissaoAtendente= sc.nextDouble();
                    Atendente atendente = new Atendente(nomeAtendente, cpfAtendente,salarioAtendente ,dataNascimentoAtendente,comissaoAtendente);
                    Funcionario.funcionarios.add(atendente);
                    System.out.println("O atendente "+(atendente.getnome())+" foi adicionado");
                    break;

                case 3:
                    Funcionario.listarFuncionarios();
                    break;

                case 4:
                    System.out.println("Digite o CPF do funcionário: ");
                    String cpfEscolhido= sc.next();
                    for (Funcionario funcionario : Funcionario.funcionarios) {
                        if (funcionario.getcpf().equals(cpfEscolhido)) {
                            System.out.println("O salário é: "+(funcionario.getsalario()));
                            
                        }
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida");;
            }
        }while(numero!=5);
        sc.close();
    }
}
