package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.n6.RegI399;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegI300 implements Serializable {
	private static final long serialVersionUID = 4044889657294379420L;

	@Getter @Inclui
	private final String reg = "I300";

    @Getter @Setter @Inclui
    private String codComp;

    @Getter @Setter @Inclui
    private BigDecimal detValor;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegI399> regI399;

    public RegI300(String codComp, BigDecimal detValor, String codCta, String infoCompl) {
        this.codComp = codComp;
        this.detValor = detValor;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegI300(){}
}
