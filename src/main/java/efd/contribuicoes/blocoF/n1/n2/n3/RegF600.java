package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegF600 {

    @Inclui
    private final String reg = "F600";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Inclui
    private LocalDate dtRet;

    @Inclui(casasDecimais = 4)
    private BigDecimal vlBcRet;

    @Inclui
    private BigDecimal vlRet;

    @Inclui
    private String codRec;

    @Inclui
    private Integer indNatRec;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlRetPis;

    @Inclui
    private BigDecimal vlRetCofins;

    @Inclui
    private Integer indDec;

}
