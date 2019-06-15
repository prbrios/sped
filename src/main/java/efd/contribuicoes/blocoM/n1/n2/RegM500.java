package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM500 {

    @Inclui
    private final String reg = "M500";

    @Inclui
    private String codCred;

    @Inclui
    private Integer indCredOri;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlCred;

    @Inclui
    private BigDecimal vlAjusAcres;

    @Inclui
    private BigDecimal vlAjusReduc;

    @Inclui
    private BigDecimal vlCredDifer;

    @Inclui
    private BigDecimal vlCredDisp;

    @Inclui
    private String indDescCred;

    @Inclui
    private BigDecimal vlCredDesc;

    @Inclui
    private BigDecimal sldCred;

}
