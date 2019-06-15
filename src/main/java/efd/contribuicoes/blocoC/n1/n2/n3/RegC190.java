package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC190 {

    @Getter @Inclui
    private final String reg = "C190";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private LocalDate dtRefIni;

    @Getter @Inclui
    private LocalDate dtRefFin;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String codNcm;

    @Getter @Inclui
    private String exIpi;

    @Getter @Inclui
    private BigDecimal vlTotItem;

    public RegC190(String codMod, LocalDate dtRefIni, LocalDate dtRefFin, String codItem, String codNcm, String exIpi, BigDecimal vlTotItem) {
        this.codMod = codMod;
        this.dtRefIni = dtRefIni;
        this.dtRefFin = dtRefFin;
        this.codItem = codItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.vlTotItem = vlTotItem;
    }

    public RegC190(){ }
}
