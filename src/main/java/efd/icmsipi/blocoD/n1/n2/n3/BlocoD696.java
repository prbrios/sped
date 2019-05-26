package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD697;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BlocoD696 {

    @Inclui
    private final String reg = "D696";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcmsUf;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

    @Filho
    private List<BlocoD697> blocoD697;

}