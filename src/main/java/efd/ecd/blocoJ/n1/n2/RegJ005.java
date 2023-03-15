package efd.ecd.blocoJ.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.RegJ100;
import efd.ecd.blocoJ.n1.n2.n3.RegJ150;
import efd.ecd.blocoJ.n1.n2.n3.RegJ210;
import efd.ecd.blocoJ.n1.n2.n3.RegJ800;
import efd.ecd.blocoJ.n1.n2.n3.RegJ801;
import lombok.Getter;
import lombok.Setter;

public class RegJ005 implements Serializable {
	private static final long serialVersionUID = 6517463535046071546L;

	@Getter @Inclui
    private final String reg = "J005";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Inclui
    private Integer idDem;

    @Getter @Setter @Inclui
    private String cabDem;

    @Getter @Setter @Filho
    private List<RegJ100> regJ100;

    @Getter @Setter @Filho
    private List<RegJ150> regJ150;

    @Getter @Setter @Filho
    private List<RegJ210> regJ210;

    @Getter @Setter @Filho
    private List<RegJ800> regJ800;

    @Getter @Setter @Filho
    private RegJ801 regJ801;

    public RegJ005() {}

    public RegJ005(LocalDate dtIni, LocalDate dtFin, Integer idDem, String cabDem) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.idDem = idDem;
        this.cabDem = cabDem;
    }

}
