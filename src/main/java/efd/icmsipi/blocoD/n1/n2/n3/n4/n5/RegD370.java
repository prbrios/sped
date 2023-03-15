package efd.icmsipi.blocoD.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD370 implements Serializable {
	private static final long serialVersionUID = -1124689598850756658L;

	@Getter @Inclui
    private final String reg = "D370";

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui
    private BigDecimal vlServ;

    @Getter @Setter @Inclui
    private Integer qtdBilh;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    public RegD370(Integer codMunOrig, BigDecimal vlServ, Integer qtdBilh, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.qtdBilh = qtdBilh;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD370(){}
}