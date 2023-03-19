package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM211 implements Serializable {
	private static final long serialVersionUID = 649664149708983820L;

	@Inclui
	private final String reg = "M211";

    @Inclui(zerosEsquerda = 2)
    private Integer indTipCoop;

    @Inclui
    private BigDecimal vlBcContAntExcCoop;

    @Inclui
    private BigDecimal vlExcCoopGer;

    @Inclui
    private BigDecimal vlExcEspCoop;

    @Inclui
    private BigDecimal vlBcCont;

    public RegM211(Integer indTipCoop, BigDecimal vlBcContAntExcCoop, BigDecimal vlExcCoopGer, BigDecimal vlExcEspCoop, BigDecimal vlBcCont) {
        this.indTipCoop = indTipCoop;
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
        this.vlExcCoopGer = vlExcCoopGer;
        this.vlExcEspCoop = vlExcEspCoop;
        this.vlBcCont = vlBcCont;
    }

    public RegM211(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndTipCoop() {
        return indTipCoop;
    }

    public void setIndTipCoop(Integer indTipCoop) {
        this.indTipCoop = indTipCoop;
    }

    public BigDecimal getVlBcContAntExcCoop() {
        return vlBcContAntExcCoop;
    }

    public void setVlBcContAntExcCoop(BigDecimal vlBcContAntExcCoop) {
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
    }

    public BigDecimal getVlExcCoopGer() {
        return vlExcCoopGer;
    }

    public void setVlExcCoopGer(BigDecimal vlExcCoopGer) {
        this.vlExcCoopGer = vlExcCoopGer;
    }

    public BigDecimal getVlExcEspCoop() {
        return vlExcEspCoop;
    }

    public void setVlExcEspCoop(BigDecimal vlExcEspCoop) {
        this.vlExcEspCoop = vlExcEspCoop;
    }

    public BigDecimal getVlBcCont() {
        return vlBcCont;
    }

    public void setVlBcCont(BigDecimal vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    
}
