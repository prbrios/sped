package efd.icmsipi.blocoC.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC105 implements Serializable {
	private static final long serialVersionUID = -659911150883200582L;

	@Inclui
    private final String reg = "C105";

    @Inclui
    private Integer oper;

    @Inclui
    private String uf;

    public RegC105(Integer oper, String uf) {
        this.oper = oper;
        this.uf = uf;
    }

    public RegC105(){}

    public String getReg() {
        return reg;
    }

    public Integer getOper() {
        return oper;
    }

    public void setOper(Integer oper) {
        this.oper = oper;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
}
