package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD359;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD350 {

    @Getter @Inclui
    private final String reg = "D350";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String ecfMod;

    @Getter @Inclui
    private String ecfFab;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private Integer cro;

    @Getter @Inclui
    private Integer crz;

    @Getter @Inclui
    private Integer numCooFin;

    @Getter @Inclui
    private BigDecimal gtFin;

    @Getter @Inclui
    private BigDecimal vlBrt;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegD359> regD359;

    public RegD350(String codMod, String ecfMod, String ecfFab, LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, BigDecimal gtFin, BigDecimal vlBrt, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codCta) {
        this.codMod = codMod;
        this.ecfMod = ecfMod;
        this.ecfFab = ecfFab;
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD350(){ }
}
