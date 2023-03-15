package efd.ecd.blocoK.n1.n2.n3.n4.n5;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegK115 implements Serializable {
	private static final long serialVersionUID = -964794831511272599L;

	@Getter @Inclui
    private final String reg = "K115";

    @Getter @Setter @Inclui
    private Integer empCodPart;

    @Getter @Setter @Inclui
    private Integer condPart;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal perEvt;

    public RegK115() {}

    public RegK115(Integer empCodPart, Integer condPart, BigDecimal perEvt) {
        this.empCodPart = empCodPart;
        this.condPart = condPart;
        this.perEvt = perEvt;
    }
    
}
