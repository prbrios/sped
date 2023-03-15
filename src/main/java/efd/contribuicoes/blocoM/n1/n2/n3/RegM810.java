package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM810 implements Serializable {
	private static final long serialVersionUID = 7925368718024739808L;

	@Getter @Inclui
	private final String reg = "M810";

    @Getter @Setter @Inclui
    private String natRec;

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    public RegM810(String natRec, BigDecimal vlRec, String codCta, String descCompl) {
        this.natRec = natRec;
        this.vlRec = vlRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM810(){}
}
