package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM105;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM110;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM100 implements Serializable {
	private static final long serialVersionUID = 8062731191681288109L;

	@Getter @Inclui
	private final String reg = "M100";

    @Getter @Setter @Inclui
    private String codCred;

    @Getter @Setter @Inclui
    private Integer indCredOri;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Setter @Inclui
    private BigDecimal vlCred;

    @Getter @Setter @Inclui
    private BigDecimal vlAjusAcres;

    @Getter @Setter @Inclui
    private BigDecimal vlAjusReduc;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDif;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDisp;

    @Getter @Setter @Inclui
    private Integer indDescCred;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDesc;

    @Getter @Setter @Inclui
    private BigDecimal sldCred;

    @Getter @Setter @Filho
    private List<RegM105> regM105;

    @Getter @Setter @Filho
    private List<RegM110> regM110;

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
