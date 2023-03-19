package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1610 implements Serializable {
	private static final long serialVersionUID = 6325272729529477939L;

	@Inclui
	private final String reg = "1610";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private String codPart;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

    public Reg1610(Long cnpj, Integer cstCofins, String codPart, LocalDate dtOper, BigDecimal vlOper, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String descCompl) {
        this.cnpj = cnpj;
        this.cstCofins = cstCofins;
        this.codPart = codPart;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public Reg1610(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public LocalDate getDtOper() {
        return dtOper;
    }

    public void setDtOper(LocalDate dtOper) {
        this.dtOper = dtOper;
    }

    public BigDecimal getVlOper() {
        return vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getDescCompl() {
        return descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }
    
}
