package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC177 implements Serializable {
	private static final long serialVersionUID = -2595647513192282820L;

	@Getter @Inclui
    private final String reg = "C177";

    @Getter @Setter @Inclui
    private String codSeloIpi;

    @Getter @Setter @Inclui
    private Long qtSeloIpi;

    @Getter @Setter @Inclui
    private String codInfItem;

    public RegC177(String codSeloIpi, Long qtSeloIpi, String codInfItem) {
        this.codSeloIpi = codSeloIpi;
        this.qtSeloIpi = qtSeloIpi;
        this.codInfItem = codInfItem;
    }

    public RegC177(){}
}
