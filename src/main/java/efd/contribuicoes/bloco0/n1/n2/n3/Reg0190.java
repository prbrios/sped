package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0190 implements Serializable {
	private static final long serialVersionUID = 5792171313367469236L;

	@Getter @Inclui
	private final String reg = "0190";

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private String descr;

    public Reg0190(String unid, String descr) {
        this.unid = unid;
        this.descr = descr;
    }

    public Reg0190(){}
}
