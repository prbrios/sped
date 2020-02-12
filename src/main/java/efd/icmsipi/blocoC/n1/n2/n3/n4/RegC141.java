package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC141 {

    @Getter @Inclui
    private final String reg = "C141";

    @Getter @Setter @Inclui
    private Integer numParc;

    @Getter @Setter @Inclui
    private LocalDate dtVcto;

    @Getter @Setter @Inclui
    private BigDecimal vlParc;

    public RegC141(Integer numParc, LocalDate dtVcto, BigDecimal vlParc) {
        this.numParc = numParc;
        this.dtVcto = dtVcto;
        this.vlParc = vlParc;
    }

    public RegC141(){}
}
