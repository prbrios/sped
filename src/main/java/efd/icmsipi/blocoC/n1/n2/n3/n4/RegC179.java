package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC179 {

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
}
