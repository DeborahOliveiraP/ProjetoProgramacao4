package domain.seguranca;

public class Auth implements Login {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        boolean isLogado = false;
        if(this.senha == senha){
            isLogado = true;
        }

        return isLogado;
    }
}
