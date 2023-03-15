package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC405;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class RegC400 implements Serializable {
	private static final long serialVersionUID = 1935183059257501242L;

	@Getter @Inclui
    private final String reg = "C400";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ecfMod;

    @Getter @Setter @Inclui
    private String ecfFab;

    @Getter @Setter @Inclui
    private Integer ecfCx;

    @Getter @Setter @Filho
    private List<RegC405> regC405;

    public RegC400(String codMod, String ecfMod, String ecfFab, Integer ecfCx) {
        this.codMod = codMod;
        this.ecfMod = ecfMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
    }

    public RegC400(){}
}