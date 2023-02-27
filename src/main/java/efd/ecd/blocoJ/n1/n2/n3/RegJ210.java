package efd.ecd.blocoJ.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.n4.RegJ215;
import lombok.Getter;
import lombok.Setter;

public class RegJ210 {

    @Getter @Inclui
    private final String reg = "J210";

    @Getter @Setter @Inclui
    private Integer indTip;

    @Getter @Setter @Inclui
    private String codAgl;

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
    private String notasExpRef;

    @Getter @Setter @Filho
    private List<RegJ215> regJ215;

    public RegJ210() {}

    public RegJ210(Integer indTip, String codAgl, String descrCodAgl, BigDecimal vlCtaIni, String indDcCtaIni,
            BigDecimal vlCtaFin, String indDcCtaFin, String notasExpRef) {
        this.indTip = indTip;
        this.codAgl = codAgl;
        this.descrCodAgl = descrCodAgl;
        this.vlCtaIni = vlCtaIni;
        this.indDcCtaIni = indDcCtaIni;
        this.vlCtaFin = vlCtaFin;
        this.indDcCtaFin = indDcCtaFin;
        this.notasExpRef = notasExpRef;
    }

}
