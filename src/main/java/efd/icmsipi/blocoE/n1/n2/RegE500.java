package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE510;
import efd.icmsipi.blocoE.n1.n2.n3.RegE520;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegE500 implements Serializable {
	private static final long serialVersionUID = -4189231192322548632L;

	@Getter @Inclui
    private final String reg = "E500";

    @Getter @Setter @Inclui
    private String indApur;

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private List<RegE510> regE510;

    @Getter @Setter @Filho
    private RegE520 regE520;

    public RegE500(String indApur, LocalDate dtIni, LocalDate dtFin) {
        this.indApur = indApur;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE500(){}
}