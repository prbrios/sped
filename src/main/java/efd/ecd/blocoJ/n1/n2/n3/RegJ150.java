package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ150 implements Serializable {
	private static final long serialVersionUID = 5226502252534184130L;

	@Getter @Inclui
    private final String reg = "J150";

    @Getter @Setter @Inclui
    private Integer nuOrdem;

    @Getter @Setter @Inclui
    private String codAgl;

    @Getter @Setter @Inclui
    private String indCodAgl;

    @Getter @Setter @Inclui
    private Integer nivelAgl;

    @Getter @Setter @Inclui
    private String codAglSup;

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
    private String indGrpDre;

    @Getter @Setter @Inclui
    private String notaExpRef;

    public RegJ150() {}
    
    public RegJ150(Integer nuOrdem, String codAgl, String indCodAgl, Integer nivelAgl, String codAglSup,
            String descrCodAgl, BigDecimal vlCtaIni, String indDcCtaIni, BigDecimal vlCtaFin, String indDcCtaFin,
            String indGrpDre, String notaExpRef) {
        this.nuOrdem = nuOrdem;
        this.codAgl = codAgl;
        this.indCodAgl = indCodAgl;
        this.nivelAgl = nivelAgl;
        this.codAglSup = codAglSup;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaIni = vlCtaIni;
        this.indDcCtaIni = indDcCtaIni;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
        this.indGrpDre = indGrpDre;
        this.notaExpRef = notaExpRef;
    }

}
