package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegD162 {

    @Inclui
    private final String reg = "D162";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    public RegD162(String codMod, String ser, Integer numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlMerc, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq) {
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