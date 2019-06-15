package efd.contribuicoes.blocoM.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM225 {

    @Getter @Inclui
    private final String reg = "M225";

    @Getter @Inclui
    private BigDecimal detValorAj;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Inclui
    private LocalDate dtOperAj;

    @Getter @Inclui
    private String descAj;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String infoCompl;

    public RegM225(BigDecimal detValorAj, Integer cstPis, BigDecimal detBcCred, BigDecimal detAliq, LocalDate dtOperAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstPis = cstPis;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOperAj = dtOperAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM225(){}
}
