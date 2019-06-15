package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM100 {

    @Inclui
    private final String reg = "M100";

    @Inclui
    private String codCred;

    @Inclui
    private Integer indCredOri;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlCred;

    @Inclui
    private BigDecimal vlAjusAcres;

    @Inclui
    private BigDecimal vlAjusReduc;

    @Inclui
    private BigDecimal vlCredDif;

    @Inclui
    private BigDecimal vlCredDisp;

    @Inclui
    private Integer indDescCred;

    @Inclui
    private BigDecimal vlCredDesc;

    @Inclui
    private BigDecimal sldCred;
}
