package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF600 implements Serializable {
	private static final long serialVersionUID = 5387050722453599420L;

	@Inclui
	private final String reg = "F600";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Inclui
    private LocalDate dtRet;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcRet;

    @Inclui
    private BigDecimal vlRet;

    @Inclui
    private String codRec;

    @Inclui
    private Integer indNatRec;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlRetPis;

    @Inclui
    private BigDecimal vlRetCofins;

    @Inclui
    private Integer indDec;

    public RegF600(Integer indNatRet, LocalDate dtRet, BigDecimal vlBcRet, BigDecimal vlRet, String codRec, Integer indNatRec, Long cnpj, BigDecimal vlRetPis, BigDecimal vlRetCofins, Integer indDec) {
        this.indNatRet = indNatRet;
        this.dtRet = dtRet;
        this.vlBcRet = vlBcRet;
        this.vlRet = vlRet;
        this.codRec = codRec;
        this.indNatRec = indNatRec;
        this.cnpj = cnpj;
        this.vlRetPis = vlRetPis;
        this.vlRetCofins = vlRetCofins;
        this.indDec = indDec;
    }

    public RegF600(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndNatRet() {
        return indNatRet;
    }

    public void setIndNatRet(Integer indNatRet) {
        this.indNatRet = indNatRet;
    }

    public LocalDate getDtRet() {
        return dtRet;
    }

    public void setDtRet(LocalDate dtRet) {
        this.dtRet = dtRet;
    }

    public BigDecimal getVlBcRet() {
        return vlBcRet;
    }

    public void setVlBcRet(BigDecimal vlBcRet) {
        this.vlBcRet = vlBcRet;
    }

    public BigDecimal getVlRet() {
        return vlRet;
    }

    public void setVlRet(BigDecimal vlRet) {
        this.vlRet = vlRet;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public Integer getIndNatRec() {
        return indNatRec;
    }

    public void setIndNatRec(Integer indNatRec) {
        this.indNatRec = indNatRec;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public BigDecimal getVlRetPis() {
        return vlRetPis;
    }

    public void setVlRetPis(BigDecimal vlRetPis) {
        this.vlRetPis = vlRetPis;
    }

    public BigDecimal getVlRetCofins() {
        return vlRetCofins;
    }

    public void setVlRetCofins(BigDecimal vlRetCofins) {
        this.vlRetCofins = vlRetCofins;
    }

    public Integer getIndDec() {
        return indDec;
    }

    public void setIndDec(Integer indDec) {
        this.indDec = indDec;
    }
    
}
