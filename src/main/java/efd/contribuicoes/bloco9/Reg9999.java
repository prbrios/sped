package efd.contribuicoes.bloco9;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg9999 implements Serializable {
	private static final long serialVersionUID = 4510978281110323149L;

	@Getter @Inclui
	private final String reg = "9999";
    
    @Getter @Setter @Inclui
    private Integer qtdLin;

}
