package efd.icmsipi.blocoH.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegH020 {

    @Getter @Inclui
    private final String reg = "H020";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui
    private BigDecimal bcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    public RegH020(Integer cstIcms, BigDecimal bcIcms, BigDecimal vlIcms) {
        this.cstIcms = cstIcms;
        this.bcIcms = bcIcms;
        this.vlIcms = vlIcms;
    }

    public RegH020(){}
}