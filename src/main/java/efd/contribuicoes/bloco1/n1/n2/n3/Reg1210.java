package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1210 {

    @Getter @Inclui
    private final String reg = "1210";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private LocalDate dtOper;

    @Getter @Inclui
    private BigDecimal vlOper;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String descCompl;

    public Reg1210(Long cnpj, Integer cstPis, String codPart, LocalDate dtOper, BigDecimal vlOper, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta, String descCompl) {
        this.cnpj = cnpj;
        this.cstPis = cstPis;
        this.codPart = codPart;
        this.dtOper = dtOper;
        this.vlOper = vlOper;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public Reg1210(){ }
}
