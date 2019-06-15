package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1500 {

    @Inclui
    private final String reg = "1500";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjSuc;

    @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Inclui
    private BigDecimal vlCredApu;

    @Inclui
    private BigDecimal vlCredExtApu;

    @Inclui
    private BigDecimal vlTotCredApu;

    @Inclui
    private BigDecimal vlCredDescPaAnt;

    @Inclui
    private BigDecimal vlCredPerPaAnt;

    @Inclui
    private BigDecimal vlCredDcompPaAnt;

    @Inclui
    private BigDecimal sdCredDispEfd;

    @Inclui
    private BigDecimal vlCredDescEfd;

    @Inclui
    private BigDecimal vlCredPerEfd;

    @Inclui
    private BigDecimal vlCredDcompEfd;

    @Inclui
    private BigDecimal vlCredTrans;

    @Inclui
    private BigDecimal vlCredOut;

    @Inclui
    private BigDecimal sldCredFim;

}
