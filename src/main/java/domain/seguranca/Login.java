package domain.seguranca;

public interface Login {

    void setSenha(int senha);
    boolean autentica(int senha);
}
