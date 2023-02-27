package efd.ecd.bloco0.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0990 {
    
	@Getter @Inclui
    private final String reg = "0990";

    @Getter @Setter @Inclui
    private Integer qtdLin0;

    public Reg0990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public Reg0990(){}
	
}
