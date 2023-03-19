package efd.ecd.blocoK.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.RegK310;

public class RegK300 implements Serializable {
	private static final long serialVersionUID = -9173136725059631724L;

	@Inclui
    private final String reg = "K300";

    @Inclui
    private String codCta;

    @Inclui
    private BigDecimal valAg;

    @Inclui
    private String indValAg;

    @Inclui
    private BigDecimal valEl;

    @Inclui
    private String indValEl;

    @Inclui
    private BigDecimal valCs;

    @Inclui
    private String indValCs;

    @Filho
    private List<RegK310> regK310;

    public RegK300(String codCta, BigDecimal valAg, String indValAg, BigDecimal valEl, String indValEl,
            BigDecimal valCs, String indValCs) {
        this.codCta = codCta;
        this.valAg = valAg;
        this.indValAg = indValAg;
        this.valEl = valEl;
        this.indValEl = indValEl;
        this.valCs = valCs;
        this.indValCs = indValCs;
    }
    
    public RegK300() {}

    public String getReg() {
        return reg;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getValAg() {
        return valAg;
    }

    public void setValAg(BigDecimal valAg) {
        this.valAg = valAg;
    }

    public String getIndValAg() {
        return indValAg;
    }

    public void setIndValAg(String indValAg) {
        this.indValAg = indValAg;
    }

    public BigDecimal getValEl() {
        return valEl;
    }

    public void setValEl(BigDecimal valEl) {
        this.valEl = valEl;
    }

    public String getIndValEl() {
        return indValEl;
    }

    public void setIndValEl(String indValEl) {
        this.indValEl = indValEl;
    }

    public BigDecimal getValCs() {
        return valCs;
    }

    public void setValCs(BigDecimal valCs) {
        this.valCs = valCs;
    }

    public String getIndValCs() {
        return indValCs;
    }

    public void setIndValCs(String indValCs) {
        this.indValCs = indValCs;
    }

    public List<RegK310> getRegK310() {
        return regK310;
    }

    public void setRegK310(List<RegK310> regK310) {
        this.regK310 = regK310;
    }
    

}
