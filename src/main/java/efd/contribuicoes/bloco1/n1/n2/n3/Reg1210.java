package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1210 {

    @Inclui
    private final String reg = "1210";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private String codPart;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

}
