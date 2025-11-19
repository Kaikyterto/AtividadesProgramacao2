package pratica9;

public class SistemaLogin {
    static final String senhaSecreta = "123456";

    static public void fazerLogin(String usuario, String senha) throws LoginInvalidoException{
        if (SistemaLogin.senhaSecreta.equals(senha)){
            System.out.println("Login feito com sucesso!");
        }
        else{
            throw new LoginInvalidoException();
        }
    }
}

