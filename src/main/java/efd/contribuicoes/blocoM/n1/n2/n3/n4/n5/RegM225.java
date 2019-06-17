package efd.contribuicoes.blocoM.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM225 {

    @Getter @Inclui
private final String reg = "M225";

    @Getter @Setter @Inclui
    private BigDecimal detValorAj;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Setter @Inclui
    private LocalDate dtOperAj;

    @Getter @Setter @Inclui
    private String descAj;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
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
