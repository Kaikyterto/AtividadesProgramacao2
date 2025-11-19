package pratica9;

public class LoginInvalidoException extends Exception{

    

     LoginInvalidoException() {
        super("Acesso Negado: Credenciais incorretas");
    }
}
