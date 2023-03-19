package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC141 implements Serializable {
	private static final long serialVersionUID = 4323208299419522168L;

	@Inclui
    private final String reg = "C141";

    @Inclui
    private Integer numParc;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private BigDecimal vlParc;

    public RegC141(Integer numParc, LocalDate dtVcto, BigDecimal vlParc) {
        this.numParc = numParc;
        this.dtVcto = dtVcto;
        this.vlParc = vlParc;
    }

    public RegC141(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public BigDecimal getVlParc() {
        return vlParc;
    }

    public void setVlParc(BigDecimal vlParc) {
        this.vlParc = vlParc;
    }
    
}
