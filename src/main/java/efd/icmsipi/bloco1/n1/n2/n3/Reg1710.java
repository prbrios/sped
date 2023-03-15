package efd.icmsipi.bloco1.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1710 implements Serializable {
	private static final long serialVersionUID = -7606966470114242472L;

	@Getter @Inclui
    private final String reg = "1710";

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    public Reg1710(Integer numDocIni, Integer numDocFin) {
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
    }

    public Reg1710(){}
}