package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1920;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1910 implements Serializable {
	private static final long serialVersionUID = 8365362595614499530L;

	@Inclui
    private final String reg = "1910";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private Reg1920 reg1920;

    public Reg1910(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public Reg1910(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public Reg1920 getReg1920() {
        return reg1920;
    }

    public void setReg1920(Reg1920 reg1920) {
        this.reg1920 = reg1920;
    }
    
}