package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1710;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reg1700 {

    @Inclui
    private final String reg = "1700";

    @Inclui
    private String codDisp;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Integer numDocFin;

    @Inclui
    private Integer numAut;

    @Filho
    private List<Reg1710> reg1710;

    public Reg1700(String codDisp, String codMod, String ser, String sub, Integer numDocIni, Integer numDocFin, Integer numAut) {
        this.codDisp = codDisp;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.numAut = numAut;
    }

    public Reg1700(){}

}