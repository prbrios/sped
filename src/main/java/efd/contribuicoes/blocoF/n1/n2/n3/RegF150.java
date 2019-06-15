package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF150 {

    @Getter @Inclui
    private final String reg = "F150";

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private BigDecimal vlTotEst;

    @Getter @Inclui
    private BigDecimal estImp;

    @Getter @Inclui
    private BigDecimal vlBcEst;

    @Getter @Inclui
    private BigDecimal vlBcMenEst;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlCredPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCredCofins;

    @Getter @Inclui
    private String descEst;

    @Getter @Inclui
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
