package efd.contribuicoes.blocoI.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;

@Getter
@Setter
public class RegI100 {

    @Inclui
    private final String reg = "I100";

    @Inclui
    private BigDecimal vlRec;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPisCofins;

    @Inclui
    private BigDecimal vlTotDedGer;

    @Inclui
    private BigDecimal vlTotDedEsp;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String infoCompl;

}
