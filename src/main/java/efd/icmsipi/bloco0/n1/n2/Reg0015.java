package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0015 implements Serializable {
	private static final long serialVersionUID = 5136146648311384866L;

	@Inclui
    private final String reg = "0015";

    @Inclui
    private String ufSt;

    @Inclui
    private String ieSt;

    public Reg0015(String ufSt, String ieSt) {
        this.ufSt = ufSt;
        this.ieSt = ieSt;
    }

    public Reg0015(){}

    public String getReg() {
        return reg;
    }

    public String getUfSt() {
        return ufSt;
    }

    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
    }

    public String getIeSt() {
        return ieSt;
    }

    public void setIeSt(String ieSt) {
        this.ieSt = ieSt;
    }
    

}
