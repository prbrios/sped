package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD696;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD695 {

    @Inclui
    private final String reg = "D695";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer nroDocIni;

    @Inclui
    private Integer nroDocFin;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String nomMest;

    @Inclui
    private String chvCodDig;

    @Filho
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