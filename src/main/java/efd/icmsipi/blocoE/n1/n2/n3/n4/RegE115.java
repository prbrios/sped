package efd.icmsipi.blocoE.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE115 {

    @Getter @Inclui
    private final String reg = "E115";

    @Getter @Setter @Inclui
    private String codInfAdic;

    @Getter @Setter @Inclui
    private BigDecimal vlInfAdic;

    @Getter @Setter @Inclui
    private String descrComplAj;

    public RegE115(String codInfAdic, BigDecimal vlInfAdic, String descrComplAj) {
        this.codInfAdic = codInfAdic;
        this.vlInfAdic = vlInfAdic;
        this.descrComplAj = descrComplAj;
    }

    public RegE115(){}
}