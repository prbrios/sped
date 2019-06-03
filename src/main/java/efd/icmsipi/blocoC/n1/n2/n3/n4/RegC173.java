package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class RegC173 {

    @Inclui
    private final String reg = "C173";

    @Inclui
    private String loteMed;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdItem;

    @Inclui
    private LocalDate dtFab;

    @Inclui
    private LocalDate dtVal;

    @Inclui
    private String indMed;

    @Inclui
    private String tpProd;

    @Inclui
    private BigDecimal vlTabMax;

    public RegC173(String loteMed, BigDecimal qtdItem, LocalDate dtFab, LocalDate dtVal, String indMed, String tpProd, BigDecimal vlTabMax) {
        this.loteMed = loteMed;
        this.qtdItem = qtdItem;
        this.dtFab = dtFab;
        this.dtVal = dtVal;
        this.indMed = indMed;
        this.tpProd = tpProd;
        this.vlTabMax = vlTabMax;
    }

    public RegC173(){}
}
