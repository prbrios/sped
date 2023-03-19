package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM505 implements Serializable {
	private static final long serialVersionUID = -6598292555883185040L;

	@Inclui
	private final String reg = "M505";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofinsTot;

    @Inclui
    private BigDecimal vlBcCofinsCum;

    @Inclui
    private BigDecimal vlBcCofinsNc;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofinsTot;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui
    private String descCred;

    public RegM505(String natBcCred, Integer cstCofins, BigDecimal vlBcCofinsTot, BigDecimal vlBcCofinsCum, BigDecimal vlBcCofinsNc, BigDecimal vlBcCofins, BigDecimal quantBcCofinsTot, BigDecimal quantBcCofins, String descCred) {
        this.natBcCred = natBcCred;
        this.cstCofins = cstCofins;
        this.vlBcCofinsTot = vlBcCofinsTot;
        this.vlBcCofinsCum = vlBcCofinsCum;
        this.vlBcCofinsNc = vlBcCofinsNc;
        this.vlBcCofins = vlBcCofins;
        this.quantBcCofinsTot = quantBcCofinsTot;
        this.quantBcCofins = quantBcCofins;
        this.descCred = descCred;
    }

    public RegM505(){ }

    public String getReg() {
        return reg;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlBcCofinsTot() {
        return vlBcCofinsTot;
    }

    public void setVlBcCofinsTot(BigDecimal vlBcCofinsTot) {
        this.vlBcCofinsTot = vlBcCofinsTot;
    }

    public BigDecimal getVlBcCofinsCum() {
        return vlBcCofinsCum;
    }

    public void setVlBcCofinsCum(BigDecimal vlBcCofinsCum) {
        this.vlBcCofinsCum = vlBcCofinsCum;
    }

    public BigDecimal getVlBcCofinsNc() {
        return vlBcCofinsNc;
    }

    public void setVlBcCofinsNc(BigDecimal vlBcCofinsNc) {
        this.vlBcCofinsNc = vlBcCofinsNc;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getQuantBcCofinsTot() {
        return quantBcCofinsTot;
    }

    public void setQuantBcCofinsTot(BigDecimal quantBcCofinsTot) {
        this.quantBcCofinsTot = quantBcCofinsTot;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public String getDescCred() {
        return descCred;
    }

    public void setDescCred(String descCred) {
        this.descCred = descCred;
    }
    
}
