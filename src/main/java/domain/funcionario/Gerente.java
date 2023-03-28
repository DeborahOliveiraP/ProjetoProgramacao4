package domain.funcionario;
import domain.seguranca.Auth;

import java.math.BigDecimal;

public class Gerente extends Funcionario {


    private Auth auth;

    public Gerente(){
        this.auth = new Auth();
    }

    public Auth getAuth() {
        return auth;
    }

    @Override
    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(BigDecimal.valueOf(0.2));
    }

}
