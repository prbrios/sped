package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegC112 implements Serializable {
	private static final long serialVersionUID = 3335662827761497679L;

	@Getter @Inclui
    private final String reg = "C112";

    @Getter @Setter @Inclui
    private String codDa;

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private String numDa;

    @Getter @Setter @Inclui
    private String codAut;

    @Getter @Setter @Inclui
    private BigDecimal vlDa;

    @Getter @Setter @Inclui
    private LocalDate dtVcto;

    @Getter @Setter @Inclui
    private LocalDate dtPgto;

    public RegC112(String codDa, String uf, String numDa, String codAut, BigDecimal vlDa, LocalDate dtVcto, LocalDate dtPgto) {
        this.codDa = codDa;
        this.uf = uf;
        this.numDa = numDa;
        this.codAut = codAut;
        this.vlDa = vlDa;
        this.dtVcto = dtVcto;
        this.dtPgto = dtPgto;
    }

    public RegC112(){}
}
