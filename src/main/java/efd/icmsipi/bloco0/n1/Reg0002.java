package efd.icmsipi.bloco0.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0002 {

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
