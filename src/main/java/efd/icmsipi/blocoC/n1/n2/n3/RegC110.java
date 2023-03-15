package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class RegC110 implements Serializable {
	private static final long serialVersionUID = -5750011719803228713L;

	@Getter @Inclui
    private final String reg = "C110";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Filho
    private List<RegC111> regC111;

    @Getter @Setter @Filho
    private List<RegC112> regC112;

    @Getter @Setter @Filho
    private List<RegC113> regC113;

    @Getter @Setter @Filho
    private List<RegC114> regC114;

    @Getter @Setter @Filho
    private List<RegC115> regC115;

    @Getter @Setter @Filho
    private List<RegC116> regC116;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}
}
