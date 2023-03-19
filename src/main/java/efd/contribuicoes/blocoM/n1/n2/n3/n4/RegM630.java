package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM630 implements Serializable {
	private static final long serialVersionUID = 4871862519243991928L;

	@Inclui
	private final String reg = "M630";

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

    public BigDecimal getCodCred() {
        return codCred;
    }

    public void setCodCred(BigDecimal codCred) {
        this.codCred = codCred;
    }

    
}
