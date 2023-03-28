package domain.conta;

import java.math.BigDecimal;

public class ContaBonificada extends Conta {

    public ContaBonificada(int conta) {
        super(conta);
        deposita(BigDecimal.valueOf(10));
    }

    @Override
    public void deposita(BigDecimal saldo) {
        super.saldo = saldo;
    }

    @Override
    public boolean saca(BigDecimal valor) {
        if(super.getSaldo().doubleValue() >= valor.doubleValue()){
            BigDecimal valorSacado = super.getSaldo().subtract(valor);
            deposita(valorSacado);
            return true;
        } else {
            return false;
        }
    }

}