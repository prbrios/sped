package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC179 implements Serializable {
	private static final long serialVersionUID = -9070511244860847710L;

	@Inclui
    private final String reg = "C179";

    @Inclui
    private BigDecimal bcStOrigDest;

    @Inclui
    private BigDecimal icmsStRep;

    @Inclui
    private BigDecimal icmsStCompl;

    @Inclui
    private BigDecimal bcRet;

    @Inclui
    private BigDecimal icmsRet;

    public RegC179(BigDecimal bcStOrigDest, BigDecimal icmsStRep, BigDecimal icmsStCompl, BigDecimal bcRet, BigDecimal icmsRet) {
        this.bcStOrigDest = bcStOrigDest;
        this.icmsStRep = icmsStRep;
        this.icmsStCompl = icmsStCompl;
        this.bcRet = bcRet;
        this.icmsRet = icmsRet;
    }

    public RegC179(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getBcStOrigDest() {
        return bcStOrigDest;
    }

    public void setBcStOrigDest(BigDecimal bcStOrigDest) {
        this.bcStOrigDest = bcStOrigDest;
    }

    public BigDecimal getIcmsStRep() {
        return icmsStRep;
    }

    public void setIcmsStRep(BigDecimal icmsStRep) {
        this.icmsStRep = icmsStRep;
    }

    public BigDecimal getIcmsStCompl() {
        return icmsStCompl;
    }

    public void setIcmsStCompl(BigDecimal icmsStCompl) {
        this.icmsStCompl = icmsStCompl;
    }

    public BigDecimal getBcRet() {
        return bcRet;
    }

    public void setBcRet(BigDecimal bcRet) {
        this.bcRet = bcRet;
    }

    public BigDecimal getIcmsRet() {
        return icmsRet;
    }

    public void setIcmsRet(BigDecimal icmsRet) {
        this.icmsRet = icmsRet;
    }
    
}
