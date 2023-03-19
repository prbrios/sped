package efd.contribuicoes.blocoM.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM225 implements Serializable {
	private static final long serialVersionUID = -6038506638813937280L;

	@Inclui
	private final String reg = "M225";

    @Inclui
    private BigDecimal detValorAj;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Inclui
    private LocalDate dtOperAj;

    @Inclui
    private String descAj;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

    public RegM225(BigDecimal detValorAj, Integer cstPis, BigDecimal detBcCred, BigDecimal detAliq, LocalDate dtOperAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstPis = cstPis;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOperAj = dtOperAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM225(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getDetValorAj() {
        return detValorAj;
    }

    public void setDetValorAj(BigDecimal detValorAj) {
        this.detValorAj = detValorAj;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getDetBcCred() {
        return detBcCred;
    }

    public void setDetBcCred(BigDecimal detBcCred) {
        this.detBcCred = detBcCred;
    }

    public BigDecimal getDetAliq() {
        return detAliq;
    }

    public void setDetAliq(BigDecimal detAliq) {
        this.detAliq = detAliq;
    }

    public LocalDate getDtOperAj() {
        return dtOperAj;
    }

    public void setDtOperAj(LocalDate dtOperAj) {
        this.dtOperAj = dtOperAj;
    }

    public String getDescAj() {
        return descAj;
    }

    public void setDescAj(String descAj) {
        this.descAj = descAj;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
}
