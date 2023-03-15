package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.n5.RegD370;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegD365 implements Serializable {
	private static final long serialVersionUID = 7169799217756282229L;

	@Getter @Inclui
    private final String reg = "D365";

    @Getter @Setter @Inclui
    private String codTotPar;

    @Getter @Setter @Inclui
    private BigDecimal vlrAcumTot;

    @Getter @Setter @Inclui
    private Integer nrTot;

    @Getter @Setter @Inclui
    private String descrNrTot;

    @Getter @Setter @Filho
    private List<RegD370> regD370;

    public RegD365(String codTotPar, BigDecimal vlrAcumTot, Integer nrTot, String descrNrTot) {
        this.codTotPar = codTotPar;
        this.vlrAcumTot = vlrAcumTot;
        this.nrTot = nrTot;
        this.descrNrTot = descrNrTot;
    }

    public RegD365(){}
}