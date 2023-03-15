package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1710;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class Reg1700 implements Serializable {
	private static final long serialVersionUID = -2055192673334359746L;

	@Getter @Inclui
    private final String reg = "1700";

    @Getter @Setter @Inclui
    private String codDisp;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String sub;

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    @Getter @Setter @Inclui
    private Integer numAut;

    @Getter @Setter @Filho
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