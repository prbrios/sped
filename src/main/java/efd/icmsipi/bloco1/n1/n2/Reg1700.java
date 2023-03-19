package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1710;

import java.io.Serializable;
import java.util.List;

public class Reg1700 implements Serializable {
	private static final long serialVersionUID = -2055192673334359746L;

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
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui
    private Integer numAut;

    @Filho
    private List<Reg1710> reg1710;

    public Reg1700(String codDisp, String codMod, String ser, String sub, Long numDocIni, Long numDocFin, Integer numAut) {
        this.codDisp = codDisp;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.numAut = numAut;
    }

    public Reg1700(){}

    public String getReg() {
        return reg;
    }

    public String getCodDisp() {
        return codDisp;
    }

    public void setCodDisp(String codDisp) {
        this.codDisp = codDisp;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
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

    public Integer getNumAut() {
        return numAut;
    }

    public void setNumAut(Integer numAut) {
        this.numAut = numAut;
    }

    public List<Reg1710> getReg1710() {
        return reg1710;
    }

    public void setReg1710(List<Reg1710> reg1710) {
        this.reg1710 = reg1710;
    }
    

}