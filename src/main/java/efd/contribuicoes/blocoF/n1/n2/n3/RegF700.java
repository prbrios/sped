package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegF700 implements Serializable {
	private static final long serialVersionUID = -8371989897723378027L;

	@Inclui
	private final String reg = "F700";

    @Inclui(zerosEsquerda = 2)
    private Integer indOriDed;

    @Inclui
    private Integer indNatDed;

    @Inclui
    private BigDecimal vlDedPis;

    @Inclui
    private BigDecimal vlDedCofins;

    @Inclui
    private BigDecimal vlBcOper;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String infComp;

    public RegF700(Integer indOriDed, Integer indNatDed, BigDecimal vlDedPis, BigDecimal vlDedCofins, BigDecimal vlBcOper, Long cnpj, String infComp) {
        this.indOriDed = indOriDed;
        this.indNatDed = indNatDed;
        this.vlDedPis = vlDedPis;
        this.vlDedCofins = vlDedCofins;
        this.vlBcOper = vlBcOper;
        this.cnpj = cnpj;
        this.infComp = infComp;
    }

    public RegF700(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndOriDed() {
        return indOriDed;
    }

    public void setIndOriDed(Integer indOriDed) {
        this.indOriDed = indOriDed;
    }

    public Integer getIndNatDed() {
        return indNatDed;
    }

    public void setIndNatDed(Integer indNatDed) {
        this.indNatDed = indNatDed;
    }

    public BigDecimal getVlDedPis() {
        return vlDedPis;
    }

    public void setVlDedPis(BigDecimal vlDedPis) {
        this.vlDedPis = vlDedPis;
    }

    public BigDecimal getVlDedCofins() {
        return vlDedCofins;
    }

    public void setVlDedCofins(BigDecimal vlDedCofins) {
        this.vlDedCofins = vlDedCofins;
    }

    public BigDecimal getVlBcOper() {
        return vlBcOper;
    }

    public void setVlBcOper(BigDecimal vlBcOper) {
        this.vlBcOper = vlBcOper;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getInfComp() {
        return infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
}
