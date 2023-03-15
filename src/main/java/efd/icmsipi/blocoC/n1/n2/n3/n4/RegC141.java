package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class RegC141 implements Serializable {
	private static final long serialVersionUID = 4323208299419522168L;

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
