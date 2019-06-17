package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC870;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC880;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC890;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

public class RegC860 {

    @Getter @Inclui
private final String reg = "C860";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private Integer nrSat;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private Integer docIni;

    @Getter @Setter @Inclui
    private Integer docFim;

    @Getter @Setter @Filho
    private List<RegC870> regC870;

    @Getter @Setter @Filho
    private List<RegC880> regC880;

    @Getter @Setter @Filho
    private List<RegC890> regC890;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFim) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFim = docFim;
    }

    public RegC860(){}
}
