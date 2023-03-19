package efd.contribuicoes.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0035 implements Serializable {
	private static final long serialVersionUID = -6920518005162389389L;

	@Inclui
    private final String reg = "0035";

    @Inclui(zerosEsquerda = 14)
    private Integer codScp;

    @Inclui
    private String descScp;

    @Inclui
    private String infComp;

    public Reg0035(Integer codScp, String descScp, String infComp) {
        this.codScp = codScp;
        this.descScp = descScp;
        this.infComp = infComp;
    }

    public Reg0035(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodScp() {
        return codScp;
    }

    public void setCodScp(Integer codScp) {
        this.codScp = codScp;
    }

    public String getDescScp() {
        return descScp;
    }

    public void setDescScp(String descScp) {
        this.descScp = descScp;
    }

    public String getInfComp() {
        return infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
}
