package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegB030 implements Serializable {
	private static final long serialVersionUID = -1731272944364057293L;

	@Getter @Inclui
    private final String reg = "B030";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Long numDocIni;

    @Getter @Setter @Inclui
    private Long numDocFin;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private Integer qtdCanc;

    @Getter @Setter @Inclui
    private BigDecimal vlCont;

    @Getter @Setter @Inclui
    private BigDecimal vlIsntIss;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIss;

    @Getter @Setter @Inclui
    private String codInfObs;

    public RegB030(String codMod, String ser, Long numDocIni, Long numDocFin, LocalDate dtDoc, Integer qtdCanc, BigDecimal vlCont, BigDecimal vlIsntIss, BigDecimal vlBcIss, BigDecimal vlIss, String codInfObs) {
        this.codMod = codMod;
        this.ser = ser;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.dtDoc = dtDoc;
        this.qtdCanc = qtdCanc;
        this.vlCont = vlCont;
        this.vlIsntIss = vlIsntIss;
        this.vlBcIss = vlBcIss;
        this.vlIss = vlIss;
        this.codInfObs = codInfObs;
    }

    public RegB030(){}
}
