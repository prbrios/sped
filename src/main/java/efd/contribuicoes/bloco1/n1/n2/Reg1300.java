package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1300 {

    @Inclui
    private final String reg = "1300";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate prRecRet;

    @Inclui
    private BigDecimal vlRetApu;

    @Inclui
    private BigDecimal vlRetDed;

    @Inclui
    private BigDecimal vlRetPer;

    @Inclui
    private BigDecimal vlRetDcomp;

    @Inclui
    private BigDecimal sldRet;

}
