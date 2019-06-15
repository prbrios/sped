package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM610 {

    //TODO: verificar diferencas de versao de layotu

    @Inclui
    private final String reg = "M610";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlRecBrt;

    @Inclui
    private BigDecimal vlBcCont;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlContApur;

    @Inclui
    private BigDecimal vlAjusAcres;

    @Inclui
    private BigDecimal vlAjusReduc;

    @Inclui
    private BigDecimal vlContDifer;

    @Inclui
    private BigDecimal vlContDiferAnt;

    @Inclui
    private BigDecimal vlContPer;

}
