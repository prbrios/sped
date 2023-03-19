package efd.icmsipi.bloco0.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0002 implements Serializable {
	private static final long serialVersionUID = 2818822090664466686L;

	@Inclui
	private final String reg = "0002";

	@Inclui(zerosEsquerda = 2)
	private Integer classEstabInd;

	public Reg0002(Integer classEstabInd) {
		this.classEstabInd = classEstabInd;
	}

	public Reg0002(){}

	public String getReg() {
		return reg;
	}

	public Integer getClassEstabInd() {
		return classEstabInd;
	}

	public void setClassEstabInd(Integer classEstabInd) {
		this.classEstabInd = classEstabInd;
	}
	
}
