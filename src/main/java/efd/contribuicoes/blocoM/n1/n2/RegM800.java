package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM810;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegM800 implements Serializable {
	private static final long serialVersionUID = -1793036534478880877L;

	@Getter @Inclui
	private final String reg = "M800";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    @Getter @Setter @Filho
    private List<RegM810> regM810;

    public RegM800(Integer cstCofins, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstCofins = cstCofins;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM800(){}
}
