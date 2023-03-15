package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.RegP210;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegP200 implements Serializable {
	private static final long serialVersionUID = -1479123505846584856L;

	@Getter @Inclui
	private final String reg = "P200";

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate perRef;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContApu;

    @Getter @Setter @Inclui
    private BigDecimal vlTotAjAcres;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContDev;

    @Getter @Setter @Inclui
    private String codRec;

    @Getter @Setter @Filho
    private List<RegP210> regP210;

    public RegP200(LocalDate perRef, BigDecimal vlTotContApu, BigDecimal vlTotAjAcres, BigDecimal vlTotContDev, String codRec) {
        this.perRef = perRef;
        this.vlTotContApu = vlTotContApu;
        this.vlTotAjAcres = vlTotAjAcres;
        this.vlTotContDev = vlTotContDev;
        this.codRec = codRec;
    }

    public RegP200(){}
}
