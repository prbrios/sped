package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RegD530 {

    @Inclui
    private final String reg = "D530";

    @Inclui
    private String indServ;

    @Inclui
    private LocalDate dtIniServ;

    @Inclui
    private LocalDate dtFinServ;

    @Inclui
    private Integer perFiscal;

    @Inclui
    private String codArea;

    @Inclui
    private Integer terminal;

    public RegD530(String indServ, LocalDate dtIniServ, LocalDate dtFinServ, Integer perFiscal, String codArea, Integer terminal) {
        this.indServ = indServ;
        this.dtIniServ = dtIniServ;
        this.dtFinServ = dtFinServ;
        this.perFiscal = perFiscal;
        this.codArea = codArea;
        this.terminal = terminal;
    }

    public RegD530(){}
}