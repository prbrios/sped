package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC181;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC185;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC188;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    @Getter @Setter @Filho
    private List<RegC181> regC181;

    @Getter @Setter @Filho
    private List<RegC185> regC185;

    @Getter @Setter @Filho
    private List<RegC188> regC188;

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
