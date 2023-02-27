package efd.ecd.blocoI.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI990 {

	@Getter @Inclui
    private static final String reg = "I990";

    @Getter @Setter @Inclui
    private Integer qtdLinI;

    public RegI990(Integer qtdLinI) {
        this.qtdLinI = qtdLinI;
    }

    public RegI990(){}
	
}
