package efd.ecd.blocoK.n1.n2.n3.n4.n5;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegK115 implements Serializable {
	private static final long serialVersionUID = -964794831511272599L;

	@Inclui
    private final String reg = "K115";

    @Inclui
    private Integer empCodPart;

    @Inclui
    private Integer condPart;

    @Inclui(casasDecimais = 4)
    private BigDecimal perEvt;

    public RegK115(Integer empCodPart, Integer condPart, BigDecimal perEvt) {
        this.empCodPart = empCodPart;
        this.condPart = condPart;
        this.perEvt = perEvt;
    }

    public RegK115() {}

    public String getReg() {
        return reg;
    }

    public Integer getEmpCodPart() {
        return empCodPart;
    }

    public void setEmpCodPart(Integer empCodPart) {
        this.empCodPart = empCodPart;
    }

    public Integer getCondPart() {
        return condPart;
    }

    public void setCondPart(Integer condPart) {
        this.condPart = condPart;
    }

    public BigDecimal getPerEvt() {
        return perEvt;
    }

    public void setPerEvt(BigDecimal perEvt) {
        this.perEvt = perEvt;
    }
    
    
}
