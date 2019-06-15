package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM230 {

    @Getter @Inclui
    private final String reg = "M230";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private BigDecimal vlVend;

    @Getter @Inclui
    private BigDecimal vlNaoReceb;

    @Getter @Inclui
    private BigDecimal vlContDif;

    @Getter @Inclui
    private BigDecimal vlCredDif;

    @Getter @Inclui
    private String codCred;

    public RegM230(Long cnpj, BigDecimal vlVend, BigDecimal vlNaoReceb, BigDecimal vlContDif, BigDecimal vlCredDif, String codCred) {
        this.cnpj = cnpj;
        this.vlVend = vlVend;
        this.vlNaoReceb = vlNaoReceb;
        this.vlContDif = vlContDif;
        this.vlCredDif = vlCredDif;
        this.codCred = codCred;
    }

    public RegM230(){}
}
