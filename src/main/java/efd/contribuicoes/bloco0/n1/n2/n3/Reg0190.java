package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0190 implements Serializable {
	private static final long serialVersionUID = 5792171313367469236L;

	@Inclui
	private final String reg = "0190";

    @Inclui
    private String unid;

    @Inclui
    private String descr;

    public Reg0190(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    public Reg0190(){}

    public String getReg() {
        return reg;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    
}
