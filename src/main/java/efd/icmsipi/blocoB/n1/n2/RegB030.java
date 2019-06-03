package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegB030 {

    @Inclui
    private final String reg = "B030";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Integer numDocFin;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer qtdCanc;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlIsntIss;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

    public RegB030(String codMod, String ser, Integer numDocIni, Integer numDocFin, LocalDate dtDoc, Integer qtdCanc, BigDecimal vlCont, BigDecimal vlIsntIss, BigDecimal vlBcIss, BigDecimal vlIss, String codInfObs) {
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
