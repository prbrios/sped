package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM410 implements Serializable {
	private static final long serialVersionUID = -2106051877125213661L;

	@Getter @Inclui
	private final String reg = "M410";

    @Getter @Setter @Inclui
    private String natRec;

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    public RegM410(String natRec, BigDecimal vlRec, String codCta, String descCompl) {
        this.natRec = natRec;
        this.vlRec = vlRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM410(){ }
}
