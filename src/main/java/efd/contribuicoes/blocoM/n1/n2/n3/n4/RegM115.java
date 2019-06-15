package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegM115 {

    @Inclui
    private final String reg = "M115";

    @Inclui
    private BigDecimal detValorAj;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Inclui
    private LocalDate dtOprAj;

    @Inclui
    private String descAj;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

}
