package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM115 {

    @Getter @Inclui
private final String reg = "M115";

    @Getter @Setter @Inclui
    private BigDecimal detValorAj;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal detBcCred;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal detAliq;

    @Getter @Setter @Inclui
    private LocalDate dtOprAj;

    @Getter @Setter @Inclui
    private String descAj;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    public RegM115(BigDecimal detValorAj, Integer cstPis, BigDecimal detBcCred, BigDecimal detAliq, LocalDate dtOprAj, String descAj, String codCta, String infoCompl) {
        this.detValorAj = detValorAj;
        this.cstPis = cstPis;
        this.detBcCred = detBcCred;
        this.detAliq = detAliq;
        this.dtOprAj = dtOprAj;
        this.descAj = descAj;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegM115(){}
}
