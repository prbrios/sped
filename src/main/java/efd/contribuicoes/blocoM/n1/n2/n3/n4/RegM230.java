package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM230 implements Serializable {
	private static final long serialVersionUID = 2464591941846987545L;

	@Inclui
	private final String reg = "M230";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlVend;

    @Inclui
    private BigDecimal vlNaoReceb;

    @Inclui
    private BigDecimal vlContDif;

    @Inclui
    private BigDecimal vlCredDif;

    @Inclui
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

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public BigDecimal getVlVend() {
        return vlVend;
    }

    public void setVlVend(BigDecimal vlVend) {
        this.vlVend = vlVend;
    }

    public BigDecimal getVlNaoReceb() {
        return vlNaoReceb;
    }

    public void setVlNaoReceb(BigDecimal vlNaoReceb) {
        this.vlNaoReceb = vlNaoReceb;
    }

    public BigDecimal getVlContDif() {
        return vlContDif;
    }

    public void setVlContDif(BigDecimal vlContDif) {
        this.vlContDif = vlContDif;
    }

    public BigDecimal getVlCredDif() {
        return vlCredDif;
    }

    public void setVlCredDif(BigDecimal vlCredDif) {
        this.vlCredDif = vlCredDif;
    }

    public String getCodCred() {
        return codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    
}
