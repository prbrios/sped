package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegF800 implements Serializable {
	private static final long serialVersionUID = -7525275712673934646L;

	@Inclui
	private final String reg = "F800";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatEven;

    @Inclui
    private LocalDate dtEven;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjSuced;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate paContCred;

    @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Inclui
    private BigDecimal vlCredPis;

    @Inclui
    private BigDecimal vlCredCofins;

    @Inclui
    private BigDecimal perCredCis;

    public RegF800(Integer indNatEven, LocalDate dtEven, Long cnpjSuced, LocalDate paContCred, Integer codCred, BigDecimal vlCredPis, BigDecimal vlCredCofins, BigDecimal perCredCis) {
        this.indNatEven = indNatEven;
        this.dtEven = dtEven;
        this.cnpjSuced = cnpjSuced;
        this.paContCred = paContCred;
        this.codCred = codCred;
        this.vlCredPis = vlCredPis;
        this.vlCredCofins = vlCredCofins;
        this.perCredCis = perCredCis;
    }

    public RegF800(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndNatEven() {
        return indNatEven;
    }

    public void setIndNatEven(Integer indNatEven) {
        this.indNatEven = indNatEven;
    }

    public LocalDate getDtEven() {
        return dtEven;
    }

    public void setDtEven(LocalDate dtEven) {
        this.dtEven = dtEven;
    }

    public Long getCnpjSuced() {
        return cnpjSuced;
    }

    public void setCnpjSuced(Long cnpjSuced) {
        this.cnpjSuced = cnpjSuced;
    }

    public LocalDate getPaContCred() {
        return paContCred;
    }

    public void setPaContCred(LocalDate paContCred) {
        this.paContCred = paContCred;
    }

    public Integer getCodCred() {
        return codCred;
    }

    public void setCodCred(Integer codCred) {
        this.codCred = codCred;
    }

    public BigDecimal getVlCredPis() {
        return vlCredPis;
    }

    public void setVlCredPis(BigDecimal vlCredPis) {
        this.vlCredPis = vlCredPis;
    }

    public BigDecimal getVlCredCofins() {
        return vlCredCofins;
    }

    public void setVlCredCofins(BigDecimal vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }

    public BigDecimal getPerCredCis() {
        return perCredCis;
    }

    public void setPerCredCis(BigDecimal perCredCis) {
        this.perCredCis = perCredCis;
    }
    
}
