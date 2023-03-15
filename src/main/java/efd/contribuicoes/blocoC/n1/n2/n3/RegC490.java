package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC491;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC495;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC499;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegC490 implements Serializable {
	private static final long serialVersionUID = 588611338041220300L;

	@Getter @Inclui
	private final String reg = "C490";

    @Getter @Setter @Inclui
    private LocalDate dtDocIni;

    @Getter @Setter @Inclui
    private LocalDate dtDocFin;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Filho
    private List<RegC491> regC491;

    @Getter @Setter @Filho
    private List<RegC495> regC495;

    @Getter @Setter @Filho
    private List<RegC499> regC499;

    public RegC490(LocalDate dtDocIni, LocalDate dtDocFin, String codMod) {
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.codMod = codMod;
    }

    public RegC490(){ }
}
