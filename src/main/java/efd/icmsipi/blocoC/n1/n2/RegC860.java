package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC870;
import efd.icmsipi.blocoC.n1.n2.n3.RegC890;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegC860 implements Serializable {
	private static final long serialVersionUID = 4102997785947095924L;

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
    private Integer docFin;

    @Getter @Setter @Filho
    private List<RegC870> regC870;

    @Getter @Setter @Filho
    private List<RegC890> regC890;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFin) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFin = docFin;
    }

    public RegC860(){}
}