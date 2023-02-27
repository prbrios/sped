package efd.ecd.bloco9.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco9.n1.n2.Reg9900;
import lombok.Getter;
import lombok.Setter;

public class Reg9001 {

    @Getter @Inclui
	private final String reg = "9001";

    @Getter @Setter @Inclui
    private Integer indDad;

    @Getter @Setter @Filho
    private List<Reg9900> reg9900;

    public Reg9001(){}

    public Reg9001(Integer indDad) {
        this.indDad = indDad;
    }

}
