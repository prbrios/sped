package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD309;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD300 {

    @Getter @Inclui
    private final String reg = "D300";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private Integer sub;

    @Getter @Inclui
    private Integer numDocIni;

    @Getter @Inclui
    private Integer numDocFin;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private LocalDate dtRef;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegD309> regD309;

    public RegD300(String codMod, String ser, Integer sub, Integer numDocIni, Integer numDocFin, Integer cfop, LocalDate dtRef, BigDecimal vlDoc, BigDecimal vlDesc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cfop = cfop;
        this.dtRef = dtRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD300(){}
}
