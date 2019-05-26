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

}
