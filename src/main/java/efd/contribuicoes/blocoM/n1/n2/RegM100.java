package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM100 {

    @Getter @Inclui
    private final String reg = "M100";

    @Getter @Inclui
    private String codCred;

    @Getter @Inclui
    private Integer indCredOri;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Inclui
    private BigDecimal vlCred;

    @Getter @Inclui
    private BigDecimal vlAjusAcres;

    @Getter @Inclui
    private BigDecimal vlAjusReduc;

    @Getter @Inclui
    private BigDecimal vlCredDif;

    @Getter @Inclui
    private BigDecimal vlCredDisp;

    @Getter @Inclui
    private Integer indDescCred;

    @Getter @Inclui
    private BigDecimal vlCredDesc;

    @Getter @Inclui
    private BigDecimal sldCred;

    public RegM100(String codCred, Integer indCredOri, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlCred, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlCredDif, BigDecimal vlCredDisp, Integer indDescCred, BigDecimal vlCredDesc, BigDecimal sldCred) {
        this.codCred = codCred;
        this.indCredOri = indCredOri;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlCred = vlCred;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlCredDif = vlCredDif;
        this.vlCredDisp = vlCredDisp;
        this.indDescCred = indDescCred;
        this.vlCredDesc = vlCredDesc;
        this.sldCred = sldCred;
    }

    public RegM100(){}
}
