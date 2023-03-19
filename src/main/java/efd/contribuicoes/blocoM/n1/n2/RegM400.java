package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM410;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM400 implements Serializable {
	private static final long serialVersionUID = -3178413027920165002L;

	@Inclui
	private final String reg = "M400";

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlTotRec;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

    @Filho
    private List<RegM410> regM410;

    public RegM400(Integer cstPis, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstPis = cstPis;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM400(){}

    public String getReg() {
        return reg;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlTotRec() {
        return vlTotRec;
    }

    public void setVlTotRec(BigDecimal vlTotRec) {
        this.vlTotRec = vlTotRec;
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

    public List<RegM410> getRegM410() {
        return regM410;
    }

    public void setRegM410(List<RegM410> regM410) {
        this.regM410 = regM410;
    }
    
}
