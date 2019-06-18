package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegE510 {

    @Getter @Inclui
    private final String reg = "E510";

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private String cstIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlContIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIpi;

    @Getter @Setter @Inclui
    private BigDecimal vlIpi;

    public RegE510(Integer cfop, String cstIpi, BigDecimal vlContIpi, BigDecimal vlBcIpi, BigDecimal vlIpi) {
        this.cfop = cfop;
        this.cstIpi = cstIpi;
        this.vlContIpi = vlContIpi;
        this.vlBcIpi = vlBcIpi;
        this.vlIpi = vlIpi;
    }

    public RegE510(){}

}