package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ100 implements Serializable {
	private static final long serialVersionUID = -515802653120544928L;

	@Getter @Inclui
    private final String reg = "J100";

    @Getter @Setter @Inclui
    private String codAgl;

    @Getter @Setter @Inclui
    private String indCodAgl;

    @Getter @Setter @Inclui
    private Integer nivelAgl;

    @Getter @Setter @Inclui
    private String codAglSup;

    @Getter @Setter @Inclui
    private String indGrpBal;

    @Getter @Setter @Inclui
    private String descrCodAgl;

    @Getter @Setter @Inclui
    private BigDecimal vlCtaIni;

    @Getter @Setter @Inclui
    private String indDcCtaIni;

    @Getter @Setter @Inclui
    private BigDecimal vlCtaFin;

    @Getter @Setter @Inclui
    private String indDcCtaFin;

    @Getter @Setter @Inclui
    private String notaExpRef;

    public RegJ100() {}

    public RegJ100(String codAgl, String indCodAgl, Integer nivelAgl, String codAglSup, String indGrpBal,
            String descrCodAgl, BigDecimal vlCtaIni, String indDcCtaIni, BigDecimal vlCtaFin, String indDcCtaFin,
            String notaExpRef) {
        this.codAgl = codAgl;
        this.indCodAgl = indCodAgl;
        this.nivelAgl = nivelAgl;
        this.codAglSup = codAglSup;
        this.indGrpBal = indGrpBal;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaIni = vlCtaIni;
        this.indDcCtaIni = indDcCtaIni;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
        this.notaExpRef = notaExpRef;
    }

}
