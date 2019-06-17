package efd.contribuicoes.blocoI.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoI.n1.n2.RegI010;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI199;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI200;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;
import java.util.List;

public class RegI100 {

    @Getter @Inclui
    private final String reg = "I100";

    @Getter @Inclui
    private BigDecimal vlRec;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPisCofins;

    @Getter @Inclui
    private BigDecimal vlTotDedGer;

    @Getter @Inclui
    private BigDecimal vlTotDedEsp;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
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
