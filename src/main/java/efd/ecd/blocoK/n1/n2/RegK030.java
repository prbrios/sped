package efd.ecd.blocoK.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.RegK100;
import lombok.Getter;
import lombok.Setter;

public class RegK030 implements Serializable {
	private static final long serialVersionUID = -941285032833914063L;

	@Getter @Inclui
    private final String reg = "K030";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private List<RegK100> regK100;

    public RegK030() {}

    public RegK030(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

}
