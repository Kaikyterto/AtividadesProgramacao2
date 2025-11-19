package pratica9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex1 {

    
    public static void main(String[] args) {
        boolean repetir;

        do {
            
            try{
            repetir = false;


            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número inteiro");
            int numerador = sc.nextInt();
            System.out.println("Digite um outro número inteiro");
            int denominador = sc.nextInt(); 
            
            int resultado = numerador/denominador;

            System.out.printf("O resultado foi %d", resultado);

            sc.close();
            }catch(InputMismatchException e){
                System.out.println("Erro: você precisa digitar um número inteiro válido.Tente novamente!");
                repetir = true;
            }catch (ArithmeticException e) {
                System.out.println("Erro: divisão por zero!Tente novamente!");
                repetir = true;
            }
    }while(repetir);
}
}
    
