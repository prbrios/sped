package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD360;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD365;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD390;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegD355 implements Serializable {
	private static final long serialVersionUID = 7752971785872730982L;

	@Getter @Inclui
    private final String reg = "D355";

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private Integer cro;

    @Getter @Setter @Inclui
    private Integer crz;

    @Getter @Setter @Inclui
    private Integer numCooFin;

    @Getter @Setter @Inclui
    private Integer gtFin;

    @Getter @Setter @Inclui
    private BigDecimal vlBrt;

    @Getter @Setter @Filho
    private RegD360 regD360;

    @Getter @Setter @Filho
    private List<RegD365> regD365;

    @Getter @Setter @Filho
    private List<RegD390> regD390;

    public RegD355(LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, Integer gtFin, BigDecimal vlBrt) {
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
    }

    public RegD355(){}
}