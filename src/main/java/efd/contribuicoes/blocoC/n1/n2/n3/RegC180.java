package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC180 {

    @Getter @Inclui
    private final String reg = "C180";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private LocalDate dtDocIni;

    @Getter @Inclui
    private LocalDate dtDocFin;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String codNcm;

    @Getter @Inclui
    private String exIpi;

    @Getter @Inclui
    private BigDecimal vlTotItem;

    public RegC180(String codMod, LocalDate dtDocIni, LocalDate dtDocFin, String codItem, String codNcm, String exIpi, BigDecimal vlTotItem) {
        this.codMod = codMod;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.codItem = codItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.vlTotItem = vlTotItem;
    }

    public RegC180(){ }
}
