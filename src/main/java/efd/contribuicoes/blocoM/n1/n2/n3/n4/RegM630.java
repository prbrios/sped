package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM630 {

    @Getter @Inclui
private final String reg = "M630";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private BigDecimal vlVend;

    @Getter @Setter @Inclui
    private BigDecimal vlNaoReceb;

    @Getter @Setter @Inclui
    private BigDecimal vlContDif;

    @Getter @Setter @Inclui
    private BigDecimal vlCredDif;

    @Getter @Setter @Inclui
    private BigDecimal codCred;

    public RegM630(Long cnpj, BigDecimal vlVend, BigDecimal vlNaoReceb, BigDecimal vlContDif, BigDecimal vlCredDif, BigDecimal codCred) {
        this.cnpj = cnpj;
        this.vlVend = vlVend;
        this.vlNaoReceb = vlNaoReceb;
        this.vlContDif = vlContDif;
        this.vlCredDif = vlCredDif;
        this.codCred = codCred;
    }

    public RegM630(){}
}
