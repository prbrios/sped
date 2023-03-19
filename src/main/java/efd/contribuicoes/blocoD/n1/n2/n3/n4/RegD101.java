package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD101 implements Serializable {
	private static final long serialVersionUID = 5510997665336138503L;

	@Inclui
	private final String reg = "D101";

    @Inclui
    private String indNatFrt;

    @Inclui
    private BigDecimal vlItem;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private String natBcCred;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

    public RegD101(String indNatFrt, BigDecimal vlItem, Integer cstPis, String natBcCred, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta) {
        this.indNatFrt = indNatFrt;
        this.vlItem = vlItem;
        this.cstPis = cstPis;
        this.natBcCred = natBcCred;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegD101(){}

    public String getReg() {
        return reg;
    }

    public String getIndNatFrt() {
        return indNatFrt;
    }

    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}
