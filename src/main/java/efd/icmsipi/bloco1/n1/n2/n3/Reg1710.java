package efd.icmsipi.bloco1.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1710 implements Serializable {
	private static final long serialVersionUID = -7606966470114242472L;

	@Inclui
    private final String reg = "1710";

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    public Reg1710(Long numDocIni, Long numDocFin) {
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
    }

    public Reg1710(){}

    public String getReg() {
        return reg;
    }

    public Long getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Long numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Long getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Long numDocFin) {
        this.numDocFin = numDocFin;
    }
    
}