package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM230 implements Serializable {
	private static final long serialVersionUID = 2464591941846987545L;

	@Getter @Inclui
	private final String reg = "M230";

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
