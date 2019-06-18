package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC191;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC190 {

    @Getter @Inclui
    private final String reg = "C190";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOpr;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private BigDecimal vlIpi;

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Filho
    private RegC191 regC191;

    public RegC190(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlRedBc, BigDecimal vlIpi, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlRedBc = vlRedBc;
        this.vlIpi = vlIpi;
        this.codObs = codObs;
    }

    public RegC190(){}
}
