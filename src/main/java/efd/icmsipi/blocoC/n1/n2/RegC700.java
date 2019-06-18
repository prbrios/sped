package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC790;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


public class RegC700 {

    @Getter @Inclui
    private final String reg = "C700";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer nroOrdIni;

    @Getter @Setter @Inclui
    private Integer nroOrdFin;

    @Getter @Setter @Inclui
    private LocalDate dtDocIni;

    @Getter @Setter @Inclui
    private LocalDate dtDocFin;

    @Getter @Setter @Inclui
    private String nomMest;

    @Getter @Setter @Inclui
    private String chvCodDig;

    @Getter @Setter @Filho
    private List<RegC790> regC790;

    public RegC700(String codMod, String ser, Integer nroOrdIni, Integer nroOrdFin, LocalDate dtDocIni, LocalDate dtDocFin, String nomMest, String chvCodDig) {
        this.codMod = codMod;
        this.ser = ser;
        this.nroOrdIni = nroOrdIni;
        this.nroOrdFin = nroOrdFin;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.nomMest = nomMest;
        this.chvCodDig = chvCodDig;
    }

    public RegC700(){}
}