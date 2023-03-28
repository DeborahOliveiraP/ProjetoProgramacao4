package domain.funcionario;

import domain.seguranca.Auth;

import java.math.BigDecimal;

public class Diretor extends Funcionario {

    private Auth auth;

    public Diretor(){
        this.auth = new Auth();
    }

    public Auth getAuth() {
        return auth;
    }
    @Override
    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(BigDecimal.valueOf(0.4));
    }


}
