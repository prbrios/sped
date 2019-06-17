package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.RegP210;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegP200 {

    @Getter @Inclui
    private final String reg = "P200";

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perRef;

    @Getter @Inclui
    private BigDecimal vlTotContApu;

    @Getter @Inclui
    private BigDecimal vlTotAjAcres;

    @Getter @Inclui
    private BigDecimal vlTotContDev;

    @Getter @Inclui
    private String codRec;

    @Getter @Setter @Filho
    private List<RegP210> regP210;

    public RegP200(LocalDate perRef, BigDecimal vlTotContApu, BigDecimal vlTotAjAcres, BigDecimal vlTotContDev, String codRec) {
        this.perRef = perRef;
        this.vlTotContApu = vlTotContApu;
        this.vlTotAjAcres = vlTotAjAcres;
        this.vlTotContDev = vlTotContDev;
        this.codRec = codRec;
    }

    public RegP200(){}
}
