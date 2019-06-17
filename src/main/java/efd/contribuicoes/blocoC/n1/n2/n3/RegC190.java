package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC191;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC195;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC198;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC199;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    @Getter @Setter @Filho
    private List<RegC191> regC191;

    @Getter @Setter @Filho
    private List<RegC195> regC195;

    @Getter @Setter @Filho
    private List<RegC198> regC198;

    @Getter @Setter @Filho
    private List<RegC199> regC199;

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
