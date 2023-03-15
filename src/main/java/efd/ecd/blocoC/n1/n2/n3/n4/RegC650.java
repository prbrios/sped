package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC650 implements Serializable {
	private static final long serialVersionUID = -3468450881299387093L;

	@Getter @Inclui
    private final String reg = "C650";

    @Getter @Setter @Inclui
    private String codAgl;

    @Getter @Setter @Inclui
    private Integer nivelAgl;

    @Getter @Setter @Inclui
    private String descrCodAgl;

    @Getter @Setter @Inclui
    private BigDecimal vlCtaFin;

    @Getter @Setter @Inclui
    private String indDcCtaFin;

    public RegC650() {}
    
    public RegC650(String codAgl, Integer nivelAgl, String descrCodAgl, BigDecimal vlCtaFin, String indDcCtaFin) {
        this.codAgl = codAgl;
        this.nivelAgl = nivelAgl;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
    }

}
