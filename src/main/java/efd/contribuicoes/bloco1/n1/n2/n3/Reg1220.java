package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1220 implements Serializable {
	private static final long serialVersionUID = -1230595662539577713L;

	@Inclui
	private final String reg = "1220";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Inclui
    private BigDecimal vlCred;

    public Reg1220(LocalDate perApuCred, Integer origCred, Integer codCred, BigDecimal vlCred) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.codCred = codCred;
        this.vlCred = vlCred;
    }

    public Reg1220(){ }

    public String getReg() {
        return reg;
    }

    public LocalDate getPerApuCred() {
        return perApuCred;
    }

    public void setPerApuCred(LocalDate perApuCred) {
        this.perApuCred = perApuCred;
    }

    public Integer getOrigCred() {
        return origCred;
    }

    public void setOrigCred(Integer origCred) {
        this.origCred = origCred;
    }

    public Integer getCodCred() {
        return codCred;
    }

    public void setCodCred(Integer codCred) {
        this.codCred = codCred;
    }

    public BigDecimal getVlCred() {
        return vlCred;
    }

    public void setVlCred(BigDecimal vlCred) {
        this.vlCred = vlCred;
    }
    
}
