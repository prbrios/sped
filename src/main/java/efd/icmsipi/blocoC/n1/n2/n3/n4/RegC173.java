package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class RegC173 {

    @Getter @Inclui
    private final String reg = "C173";

    @Getter @Setter @Inclui
    private String loteMed;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtdItem;

    @Getter @Setter @Inclui
    private LocalDate dtFab;

    @Getter @Setter @Inclui
    private LocalDate dtVal;

    @Getter @Setter @Inclui
    private String indMed;

    @Getter @Setter @Inclui
    private String tpProd;

    @Getter @Setter @Inclui
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
