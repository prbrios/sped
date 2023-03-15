package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM605;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM610;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM600 implements Serializable {
	private static final long serialVersionUID = 5962877550676541715L;

	@Getter @Inclui
	private final String reg = "M600";

    @Getter @Setter @Inclui
    private BigDecimal vlTotContNcPer;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredDesc;

    @Getter @Setter @Inclui
    private BigDecimal vltotCredDescAnt;

    @Getter @Setter @Inclui
    private BigDecimal vltotContNcDev;

    @Getter @Setter @Inclui
    private BigDecimal vlRetNc;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDedNc;

    @Getter @Setter @Inclui
    private BigDecimal vlContNcRec;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContCumPer;

    @Getter @Setter @Inclui
    private BigDecimal vlRetCum;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDedCum;

    @Getter @Setter @Inclui
    private BigDecimal vlContCumRec;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContRec;

    @Getter @Setter @Filho
    private List<RegM605> regM605;

    @Getter @Setter @Filho
    private List<RegM610> regM610;

    public RegM600(BigDecimal vlTotContNcPer, BigDecimal vlTotCredDesc, BigDecimal vltotCredDescAnt, BigDecimal vltotContNcDev, BigDecimal vlRetNc, BigDecimal vlOutDedNc, BigDecimal vlContNcRec, BigDecimal vlTotContCumPer, BigDecimal vlRetCum, BigDecimal vlOutDedCum, BigDecimal vlContCumRec, BigDecimal vlTotContRec) {
        this.vlTotContNcPer = vlTotContNcPer;
        this.vlTotCredDesc = vlTotCredDesc;
        this.vltotCredDescAnt = vltotCredDescAnt;
        this.vltotContNcDev = vltotContNcDev;
        this.vlRetNc = vlRetNc;
        this.vlOutDedNc = vlOutDedNc;
        this.vlContNcRec = vlContNcRec;
        this.vlTotContCumPer = vlTotContCumPer;
        this.vlRetCum = vlRetCum;
        this.vlOutDedCum = vlOutDedCum;
        this.vlContCumRec = vlContCumRec;
        this.vlTotContRec = vlTotContRec;
    }

    public RegM600(){}
}
