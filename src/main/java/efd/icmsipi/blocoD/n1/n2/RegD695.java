package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD696;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegD695 implements Serializable {
	private static final long serialVersionUID = -1789591246036476752L;

	@Getter @Inclui
    private final String reg = "D695";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer nroDocIni;

    @Getter @Setter @Inclui
    private Integer nroDocFin;

    @Getter @Setter @Inclui
    private LocalDate dtDocIni;

    @Getter @Setter @Inclui
    private LocalDate dtDocFin;

    @Getter @Setter @Inclui
    private String nomMest;

    @Getter @Setter @Inclui
    private String chvCodDig;

    @Getter @Setter @Filho
    private List<RegD696> regD696;

    public RegD695(String codMod, String ser, Integer nroDocIni, Integer nroDocFin, LocalDate dtDocIni, LocalDate dtDocFin, String nomMest, String chvCodDig) {
        this.codMod = codMod;
        this.ser = ser;
        this.nroDocIni = nroDocIni;
        this.nroDocFin = nroDocFin;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.nomMest = nomMest;
        this.chvCodDig = chvCodDig;
    }

    public RegD695(){}
}