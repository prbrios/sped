package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class RegC141 {

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
}
