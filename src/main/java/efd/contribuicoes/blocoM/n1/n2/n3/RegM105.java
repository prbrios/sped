package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM105 implements Serializable {
	private static final long serialVersionUID = -7642051819185099515L;

	@Inclui
    private final String reg = "M105";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPisTot;

    @Inclui
    private BigDecimal vlBcPisCum;

    @Inclui
    private BigDecimal vlbcPisNc;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPisTot;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui
    private String descCred;

    public RegM105(String natBcCred, Integer cstPis, BigDecimal vlBcPisTot, BigDecimal vlBcPisCum, BigDecimal vlbcPisNc, BigDecimal vlBcPis, BigDecimal quantBcPisTot, BigDecimal quantBcPis, String descCred) {
        this.natBcCred = natBcCred;
        this.cstPis = cstPis;
        this.vlBcPisTot = vlBcPisTot;
        this.vlBcPisCum = vlBcPisCum;
        this.vlbcPisNc = vlbcPisNc;
        this.vlBcPis = vlBcPis;
        this.quantBcPisTot = quantBcPisTot;
        this.quantBcPis = quantBcPis;
        this.descCred = descCred;
    }

    public RegM105(){}

    public String getReg() {
        return reg;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlBcPisTot() {
        return vlBcPisTot;
    }

    public void setVlBcPisTot(BigDecimal vlBcPisTot) {
        this.vlBcPisTot = vlBcPisTot;
    }

    public BigDecimal getVlBcPisCum() {
        return vlBcPisCum;
    }

    public void setVlBcPisCum(BigDecimal vlBcPisCum) {
        this.vlBcPisCum = vlBcPisCum;
    }

    public BigDecimal getVlbcPisNc() {
        return vlbcPisNc;
    }

    public void setVlbcPisNc(BigDecimal vlbcPisNc) {
        this.vlbcPisNc = vlbcPisNc;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getQuantBcPisTot() {
        return quantBcPisTot;
    }

    public void setQuantBcPisTot(BigDecimal quantBcPisTot) {
        this.quantBcPisTot = quantBcPisTot;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public String getDescCred() {
        return descCred;
    }

    public void setDescCred(String descCred) {
        this.descCred = descCred;
    }
    
}
