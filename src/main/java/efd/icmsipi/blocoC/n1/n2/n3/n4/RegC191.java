package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC191 {

    @Getter @Inclui
    private final String reg = "C191";

    @Getter @Setter @Inclui
    private BigDecimal vlFcpOp;

    @Getter @Setter @Inclui
    private BigDecimal vlFcpSt;

    @Getter @Setter @Inclui
    private BigDecimal vlFcpRet;

    public RegC191(BigDecimal vlFcpOp, BigDecimal vlFcpSt, BigDecimal vlFcpRet) {
        this.vlFcpOp = vlFcpOp;
        this.vlFcpSt = vlFcpSt;
        this.vlFcpRet = vlFcpRet;
    }

    public RegC191(){}
}
