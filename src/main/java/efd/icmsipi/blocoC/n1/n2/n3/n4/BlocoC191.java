package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoC191 {

    @Inclui
    private final String reg = "C191";

    @Inclui
    private BigDecimal vlFcpOp;

    @Inclui
    private BigDecimal vlFcpSt;

    @Inclui
    private BigDecimal vlFcpRet;

}
