package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Reg1600 {

    @Getter @Inclui
    private final String reg = "1600";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private BigDecimal totCredito;

    @Getter @Setter @Inclui
    private BigDecimal totDebito;

    public Reg1600(String codPart, BigDecimal totCredito, BigDecimal totDebito) {
        this.codPart = codPart;
        this.totCredito = totCredito;
        this.totDebito = totDebito;
    }

    public Reg1600(){}

}