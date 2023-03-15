package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.RegH005;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class RegH001 implements Serializable {
	private static final long serialVersionUID = 7447776642584254147L;

	@Getter @Inclui
    private final String reg = "H001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegH005> regH005;

    public RegH001(String indMov) {
        this.indMov = indMov;
    }

    public RegH001(){}
}