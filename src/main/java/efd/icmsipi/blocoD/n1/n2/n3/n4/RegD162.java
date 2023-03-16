package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegD162 implements Serializable {
	private static final long serialVersionUID = 5672293304819962150L;

	@Getter @Inclui
    private final String reg = "D162";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Long numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlMerc;

    @Getter @Setter @Inclui
    private Integer qtdVol;

    @Getter @Setter @Inclui
    private BigDecimal pesoBrt;

    @Getter @Setter @Inclui
    private BigDecimal pesoLiq;

    public RegD162(String codMod, String ser, Long numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlMerc, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq) {
        this.codMod = codMod;
        this.ser = ser;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlMerc = vlMerc;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
    }

    public RegD162(){}
}