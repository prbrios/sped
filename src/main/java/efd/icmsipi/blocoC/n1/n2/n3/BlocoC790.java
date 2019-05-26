package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.BlocoC176;
import efd.icmsipi.blocoC.n1.n2.n3.n4.BlocoC791;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BlocoC790 {

    @Inclui
    private final String reg = "C790";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOper;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

    @Filho
    private List<BlocoC791> blocoC791;

}