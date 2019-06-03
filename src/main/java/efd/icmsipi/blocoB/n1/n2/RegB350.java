package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB350 {

    @Inclui
    private final String reg = "B350";

    @Inclui
    private String codCtd;

    @Inclui
    private String ctaIss;

    @Inclui(zerosEsquerda = 8)
    private Integer ctaCosif;

    @Inclui
    private Integer qtdOcor;

    @Inclui(zerosEsquerda = 4)
    private Integer codServ;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codIndObs;

    public RegB350(String codCtd, String ctaIss, Integer ctaCosif, Integer qtdOcor, Integer codServ, BigDecimal vlCont, BigDecimal vlBcIss, BigDecimal aliqIss, BigDecimal vlIss, String codIndObs) {
        this.codCtd = codCtd;
        this.ctaIss = ctaIss;
        this.ctaCosif = ctaCosif;
        this.qtdOcor = qtdOcor;
        this.codServ = codServ;
        this.vlCont = vlCont;
        this.vlBcIss = vlBcIss;
        this.aliqIss = aliqIss;
        this.vlIss = vlIss;
        this.codIndObs = codIndObs;
    }

    public RegB350(){}
}
