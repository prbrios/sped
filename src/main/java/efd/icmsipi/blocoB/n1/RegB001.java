package efd.icmsipi.blocoB.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.*;
import efd.icmsipi.blocoB.n1.n2.n3.RegB035;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


public class RegB001 implements Serializable {
	private static final long serialVersionUID = 6897109089198534154L;

	@Getter @Inclui
    private final String reg = "B001";

    @Getter @Setter @Inclui
    private String indDad;

    @Getter @Setter @Filho
    private List<RegB020> regB020;

    @Getter @Setter @Filho
    private List<RegB030> regB030;

    @Getter @Setter @Filho
    private List<RegB035> regB035;

    @Getter @Setter @Filho
    private List<RegB350> regB350;

    @Getter @Setter @Filho
    private List<RegB420> regB420;

    @Getter @Setter @Filho
    private List<RegB440> regB440;

    @Getter @Setter @Filho
    private List<RegB460> regB460;

    @Getter @Setter @Filho
    private RegB470 regB470;

    @Getter @Setter @Filho
    private RegB500 regB500;

    public RegB001(String indDad) {
        this.indDad = indDad;
    }

    public RegB001(){}
}
