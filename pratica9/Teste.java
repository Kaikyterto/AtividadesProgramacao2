package pratica9;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome de usuário: ");
            String usuario = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();

            SistemaLogin.fazerLogin(usuario,senha);

             sc.close();
        }catch(LoginInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
