package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM210 {

    //TODO resoler esse registro. Há campos diferentes para periodos do ano

    @Inclui
    private final String reg = "M210";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlRecBrt;

    @Inclui
    private BigDecimal vlBcCont;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

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
