package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.Setter;

public class RegC155 implements Serializable {
	private static final long serialVersionUID = 54202026575163382L;

	@Getter @Include
    private final String reg = "C155";

    @Getter @Setter @Inclui
    private String codCtaRec;

    @Getter @Setter @Inclui
    private String codCcusRec;

    @Getter @Setter @Inclui
    private BigDecimal vlSldIniRec;

    @Getter @Setter @Inclui
    private String indDcIniRec;

    @Getter @Setter @Inclui
    private BigDecimal vlDebRec;

    @Getter @Setter @Inclui
    private BigDecimal vlCredRec;

    @Getter @Setter @Inclui
    private BigDecimal vlSldFinRec;

    @Getter @Setter @Inclui
    private String indDcFinRec;

    public RegC155() {}
    
    public RegC155(String codCtaRec, String codCcusRec, BigDecimal vlSldIniRec, String indDcIniRec, BigDecimal vlDebRec,
            BigDecimal vlCredRec, BigDecimal vlSldFinRec, String indDcFinRec) {
        this.codCtaRec = codCtaRec;
        this.codCcusRec = codCcusRec;
        this.vlSldIniRec = vlSldIniRec;
        this.indDcIniRec = indDcIniRec;
        this.vlDebRec = vlDebRec;
        this.vlCredRec = vlCredRec;
        this.vlSldFinRec = vlSldFinRec;
        this.indDcFinRec = indDcFinRec;
    }

}
