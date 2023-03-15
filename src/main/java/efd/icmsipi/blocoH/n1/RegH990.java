package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;




public class RegH990 implements Serializable {
	private static final long serialVersionUID = 6713190012473513999L;

	@Getter @Inclui
    private final String reg = "H990";

    @Getter @Setter @Inclui
    private Integer qtdLinH;

    public RegH990(Integer qtdLinH) {
        this.qtdLinH = qtdLinH;
    }

    public RegH990(){}
}