package efd.contribuicoes.blocoI.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI199;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI200;
import lombok.Getter;
import lombok.Setter;

public class RegI100 {

    @Getter @Inclui
private final String reg = "I100";

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPisCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDedGer;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDedEsp;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegI199> regI199;

    @Getter @Setter @Filho
    private List<RegI200> regI200;

    public RegI100(BigDecimal vlRec, Integer cstPisCofins, BigDecimal vlTotDedGer, BigDecimal vlTotDedEsp, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String infoCompl) {
        this.vlRec = vlRec;
        this.cstPisCofins = cstPisCofins;
        this.vlTotDedGer = vlTotDedGer;
        this.vlTotDedEsp = vlTotDedEsp;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.infoCompl = infoCompl;
    }

    public RegI100(){}
}
