package efd;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.ecd.bloco0.Reg0000;
import efd.ecd.bloco9.Reg9999;

public class Ecd implements Serializable {
	private static final long serialVersionUID = 791923285674767022L;

	@Filho
    private Reg0000 reg0000;
    
    @Filho
    private Reg9999 reg9999;

    public Reg0000 getReg0000() {
        return reg0000;
    }

    public void setReg0000(Reg0000 reg0000) {
        this.reg0000 = reg0000;
    }

    public Reg9999 getReg9999() {
        return reg9999;
    }

    public void setReg9999(Reg9999 reg9999) {
        this.reg9999 = reg9999;
    }
    

}
