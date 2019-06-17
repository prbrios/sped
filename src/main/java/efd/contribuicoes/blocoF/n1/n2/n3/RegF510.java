package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF211;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF519;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class RegF510 {

    @Getter @Inclui
    private final String reg = "F510";

    @Getter @Inclui
    private BigDecimal vlRecCaixa;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlDescPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlDescCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
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
