package efd.ecd.blocoJ.n1;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.RegJ005;
import efd.ecd.blocoJ.n1.n2.RegJ900;
import lombok.Getter;
import lombok.Setter;

public class RegJ001 implements Serializable {
	private static final long serialVersionUID = -5507601689397579683L;

	@Getter @Inclui
    private final String reg = "J001";

    @Getter @Setter @Inclui
    private Integer indDad;

    @Getter @Setter @Filho
    private List<RegJ005> regJ005;

    @Getter @Setter @Filho
    private RegJ900 regJ900;

    public RegJ001() {}

    public RegJ001(Integer indDad) {
        this.indDad = indDad;
    }

}
