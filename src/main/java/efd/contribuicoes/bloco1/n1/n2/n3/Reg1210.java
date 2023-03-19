package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1210 implements Serializable {
	private static final long serialVersionUID = -7811118136069186809L;

	@Inclui
	private final String reg = "1210";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private String codPart;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

    public Reg1210(Long cnpj, Integer cstPis, String codPart, LocalDate dtOper, BigDecimal vlOper, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta, String descCompl) {
        this.cnpj = cnpj;
        this.cstPis = cstPis;
        this.codPart = codPart;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public Reg1210(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
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

    public String getDescCompl() {
        return descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }
    
}
