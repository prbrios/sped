package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF150 {

    @Getter @Inclui
private final String reg = "F150";

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private BigDecimal vlTotEst;

    @Getter @Setter @Inclui
    private BigDecimal estImp;

    @Getter @Setter @Inclui
    private BigDecimal vlBcEst;

    @Getter @Setter @Inclui
    private BigDecimal vlBcMenEst;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofins;

    @Getter @Setter @Inclui
    private String descEst;

    @Getter @Setter @Inclui
    private String codCta;

    public RegF150(String natBcCred, BigDecimal vlTotEst, BigDecimal estImp, BigDecimal vlBcEst, BigDecimal vlBcMenEst, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPis, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofins, String descEst, String codCta) {
        this.natBcCred = natBcCred;
        this.vlTotEst = vlTotEst;
        this.estImp = estImp;
        this.vlBcEst = vlBcEst;
        this.vlBcMenEst = vlBcMenEst;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPis = vlCredPis;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofins = vlCredCofins;
        this.descEst = descEst;
        this.codCta = codCta;
    }

    public RegF150(){ }
}
