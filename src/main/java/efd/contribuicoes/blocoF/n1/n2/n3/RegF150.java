package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF150 {

    @Inclui
    private final String reg = "F150";

    @Inclui
    private String natBcCred;

    @Inclui
    private BigDecimal vlTotEst;

    @Inclui
    private BigDecimal estImp;

    @Inclui
    private BigDecimal vlBcEst;

    @Inclui
    private BigDecimal vlBcMenEst;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofins;

    @Inclui
    private String descEst;

    @Inclui
    private String codCta;

}
