package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC380 {

    @Getter @Inclui
    private final String reg = "C380";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private LocalDate dtDocIni;

    @Getter @Inclui
    private LocalDate dtDocFin;

    @Getter @Inclui
    private Integer numDocIni;

    @Getter @Inclui
    private Integer numDocFin;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDocCanc;

    public RegC380(String codMod, LocalDate dtDocIni, LocalDate dtDocFin, Integer numDocIni, Integer numDocFin, BigDecimal vlDoc, BigDecimal vlDocCanc) {
        this.codMod = codMod;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.vlDoc = vlDoc;
        this.vlDocCanc = vlDocCanc;
    }

    public RegC380(){ }
}
