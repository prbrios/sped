package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC425;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegC420 implements Serializable {
	private static final long serialVersionUID = 5350757279174997710L;

	@Getter @Inclui
    private final String reg = "C420";

    @Getter @Setter @Inclui
    private String codTotPar;

    @Getter @Setter @Inclui
    private BigDecimal vlrAcumTot;

    @Getter @Setter @Inclui
    private Integer nrTot;

    @Getter @Setter @Inclui
    private String descrNrTot;

    @Getter @Setter @Filho
    private List<RegC425> regC425;

    public RegC420(String codTotPar, BigDecimal vlrAcumTot, Integer nrTot, String descrNrTot) {
        this.codTotPar = codTotPar;
        this.vlrAcumTot = vlrAcumTot;
        this.nrTot = nrTot;
        this.descrNrTot = descrNrTot;
    }

    public RegC420(){}
}