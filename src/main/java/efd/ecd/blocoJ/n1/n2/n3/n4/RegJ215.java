package efd.ecd.blocoJ.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ215 implements Serializable {
	private static final long serialVersionUID = 2571913113640678357L;

	@Getter @Inclui
    private final String reg = "J215";

    @Getter @Setter @Inclui
    private String codHistFat;

    @Getter @Setter @Inclui
    private String descFat;

    @Getter @Setter @Inclui
    private BigDecimal vlFatCont;

    @Getter @Setter @Inclui
    private String indDcFat;

    public RegJ215() {}
    
    public RegJ215(String codHistFat, String descFat, BigDecimal vlFatCont, String indDcFat) {
        this.codHistFat = codHistFat;
        this.descFat = descFat;
        this.vlFatCont = vlFatCont;
        this.indDcFat = indDcFat;
    }

}
