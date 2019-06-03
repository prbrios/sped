package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1600 {

    @Inclui
    private final String reg = "1600";

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal totCredito;

    @Inclui
    private BigDecimal totDebito;

    public Reg1600(String codPart, BigDecimal totCredito, BigDecimal totDebito) {
        this.codPart = codPart;
        this.totCredito = totCredito;
        this.totDebito = totDebito;
    }

    public Reg1600(){}

}