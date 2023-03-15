package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC381;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC385;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC380 implements Serializable {
	private static final long serialVersionUID = 5960683522266230874L;

	@Getter @Inclui
	private final String reg = "C380";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private LocalDate dtDocIni;

    @Getter @Setter @Inclui
    private LocalDate dtDocFin;

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDocCanc;

    @Getter @Setter @Filho
    private List<RegC381> regC381;

    @Getter @Setter @Filho
    private List<RegC385> regC385;

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
