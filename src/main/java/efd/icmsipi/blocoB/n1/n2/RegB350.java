package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegB350 implements Serializable {
	private static final long serialVersionUID = -1737814539193547357L;

	@Getter @Inclui
    private final String reg = "B350";

    @Getter @Setter @Inclui
    private String codCtd;

    @Getter @Setter @Inclui
    private String ctaIss;

    @Getter @Setter @Inclui(zerosEsquerda = 8)
    private Integer ctaCosif;

    @Getter @Setter @Inclui
    private Integer qtdOcor;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer codServ;

    @Getter @Setter @Inclui
    private BigDecimal vlCont;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIss;

    @Getter @Setter @Inclui
    private BigDecimal aliqIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIss;

    @Getter @Setter @Inclui
    private String codIndObs;

    public RegB350(String codCtd, String ctaIss, Integer ctaCosif, Integer qtdOcor, Integer codServ, BigDecimal vlCont, BigDecimal vlBcIss, BigDecimal aliqIss, BigDecimal vlIss, String codIndObs) {
        this.codCtd = codCtd;
        this.ctaIss = ctaIss;
        this.ctaCosif = ctaCosif;
        this.qtdOcor = qtdOcor;
        this.codServ = codServ;
        this.vlCont = vlCont;
        this.vlBcIss = vlBcIss;
        this.aliqIss = aliqIss;
        this.vlIss = vlIss;
        this.codIndObs = codIndObs;
    }

    public RegB350(){}
}
