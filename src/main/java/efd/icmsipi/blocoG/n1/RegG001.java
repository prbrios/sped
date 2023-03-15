package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.RegG110;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class RegG001 implements Serializable {
	private static final long serialVersionUID = 3195764686921234591L;

	@Getter @Inclui
    private final String reg = "G001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegG110> regG110;

    public RegG001(String indMov) {
        this.indMov = indMov;
    }

    public RegG001(){}
}