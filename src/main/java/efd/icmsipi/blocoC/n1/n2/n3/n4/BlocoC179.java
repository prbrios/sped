package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoC179 {

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

}
