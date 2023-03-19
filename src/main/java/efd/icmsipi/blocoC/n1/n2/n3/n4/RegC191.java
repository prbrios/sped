package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC191 implements Serializable {
	private static final long serialVersionUID = -663441550044333615L;

	@Inclui
    private final String reg = "C191";

    @Inclui
    private BigDecimal vlFcpOp;

    @Inclui
    private BigDecimal vlFcpSt;

    @Inclui
    private BigDecimal vlFcpRet;

    public RegC191(BigDecimal vlFcpOp, BigDecimal vlFcpSt, BigDecimal vlFcpRet) {
        this.vlFcpOp = vlFcpOp;
        this.vlFcpSt = vlFcpSt;
        this.vlFcpRet = vlFcpRet;
    }

    public RegC191(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlFcpOp() {
        return vlFcpOp;
    }

    public void setVlFcpOp(BigDecimal vlFcpOp) {
        this.vlFcpOp = vlFcpOp;
    }

    public BigDecimal getVlFcpSt() {
        return vlFcpSt;
    }

    public void setVlFcpSt(BigDecimal vlFcpSt) {
        this.vlFcpSt = vlFcpSt;
    }

    public BigDecimal getVlFcpRet() {
        return vlFcpRet;
    }

    public void setVlFcpRet(BigDecimal vlFcpRet) {
        this.vlFcpRet = vlFcpRet;
    }
    
}
