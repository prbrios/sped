package efd.icmsipi.bloco0.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0002 implements Serializable {
	private static final long serialVersionUID = 2818822090664466686L;

	@Getter
	@Inclui
	private final String reg = "0002";

	@Getter @Setter @Inclui(zerosEsquerda = 2)
	private Integer classEstabInd;

	public Reg0002(Integer classEstabInd) {
		this.classEstabInd = classEstabInd;
	}

	public Reg0002(){}
}
