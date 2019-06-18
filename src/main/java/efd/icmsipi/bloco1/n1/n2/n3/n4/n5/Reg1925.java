package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Reg1925 {

    @Getter @Inclui
    private final String reg = "1925";

    @Getter @Setter @Inclui
    private String codInfAdic;

    @Getter @Setter @Inclui
    private BigDecimal vlInfAdic;

    @Getter @Setter @Inclui
    private String descrComplAj;

    public Reg1925(String codInfAdic, BigDecimal vlInfAdic, String descrComplAj) {
        this.codInfAdic = codInfAdic;
        this.vlInfAdic = vlInfAdic;
        this.descrComplAj = descrComplAj;
    }

    public Reg1925(){}
}