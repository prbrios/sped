package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM505;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM510;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class RegM500 {

    @Getter @Inclui
    private final String reg = "M500";

    @Getter @Inclui
    private String codCred;

    @Getter @Inclui
    private Integer indCredOri;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Inclui
    private BigDecimal vlCred;

    @Getter @Inclui
    private BigDecimal vlAjusAcres;

    @Getter @Inclui
    private BigDecimal vlAjusReduc;

    @Getter @Inclui
    private BigDecimal vlCredDifer;

    @Getter @Inclui
    private BigDecimal vlCredDisp;

    @Getter @Inclui
    private String indDescCred;

    @Getter @Inclui
    private BigDecimal vlCredDesc;

    @Getter @Inclui
    private BigDecimal sldCred;

    @Getter @Setter @Filho
    private List<RegM505> regM505;

    @Getter @Setter @Filho
    private List<RegM510> regM510;

    public RegM500(String codCred, Integer indCredOri, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCred, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlCredDifer, BigDecimal vlCredDisp, String indDescCred, BigDecimal vlCredDesc, BigDecimal sldCred) {
        this.codCred = codCred;
        this.indCredOri = indCredOri;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCred = vlCred;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlCredDifer = vlCredDifer;
        this.vlCredDisp = vlCredDisp;
        this.indDescCred = indDescCred;
        this.vlCredDesc = vlCredDesc;
        this.sldCred = sldCred;
    }

    public RegM500(){}
}
