package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM810;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegM800 implements Serializable {
	private static final long serialVersionUID = -1793036534478880877L;

	@Inclui
	private final String reg = "M800";

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlTotRec;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

    @Filho
    private List<RegM810> regM810;

    public RegM800(Integer cstCofins, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstCofins = cstCofins;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM800(){}

    public String getReg() {
        return reg;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
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

    public List<RegM810> getRegM810() {
        return regM810;
    }

    public void setRegM810(List<RegM810> regM810) {
        this.regM810 = regM810;
    }
    
}
