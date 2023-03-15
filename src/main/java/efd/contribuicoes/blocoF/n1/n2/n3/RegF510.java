package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF519;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegF510 implements Serializable {
	private static final long serialVersionUID = 234527733027686624L;

	@Getter @Inclui
	private final String reg = "F510";

    @Getter @Setter @Inclui
    private BigDecimal vlRecCaixa;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlDescPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlDescCofins;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegF519> regF519;

    public RegF510(BigDecimal vlRecCaixa, Integer cstPis, BigDecimal vlDescPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal vlDescCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codMod, Integer cfop, String codCta, String infoCompl) {
        this.vlRecCaixa = vlRecCaixa;
        this.cstPis = cstPis;
        this.vlDescPis = vlDescPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlDescCofins = vlDescCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codMod = codMod;
        this.cfop = cfop;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegF510(){}
}
