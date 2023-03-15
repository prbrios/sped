package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegG126 implements Serializable {
	private static final long serialVersionUID = 4561528865969522724L;

	@Getter @Inclui
    private final String reg = "G126";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Inclui
    private Integer numParc;

    @Getter @Setter @Inclui
    private BigDecimal vlParcPass;

    @Getter @Setter @Inclui
    private BigDecimal clTribOc;

    @Getter @Setter @Inclui
    private BigDecimal vlTotal;

    @Getter @Setter @Inclui
    private BigDecimal indPerSai;

    @Getter @Setter @Inclui
    private BigDecimal vlParcAprop;

    public RegG126(LocalDate dtIni, LocalDate dtFin, Integer numParc, BigDecimal vlParcPass, BigDecimal clTribOc, BigDecimal vlTotal, BigDecimal indPerSai, BigDecimal vlParcAprop) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.numParc = numParc;
        this.vlParcPass = vlParcPass;
        this.clTribOc = clTribOc;
        this.vlTotal = vlTotal;
        this.indPerSai = indPerSai;
        this.vlParcAprop = vlParcAprop;
    }

    public RegG126(){}
}