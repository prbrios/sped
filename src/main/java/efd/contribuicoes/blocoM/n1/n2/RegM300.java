package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM300 implements Serializable {
	private static final long serialVersionUID = -8252342798855182413L;

	@Inclui
	private final String reg = "M300";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlContAputDifer;

    @Inclui
    private String natCredDesc;

    @Inclui
    private BigDecimal vlCredDescDifer;

    @Inclui
    private BigDecimal vlContDiferAnt;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApur;

    @Inclui
    private LocalDate dtReceb;

    public RegM300(String codCont, BigDecimal vlContAputDifer, String natCredDesc, BigDecimal vlCredDescDifer, BigDecimal vlContDiferAnt, LocalDate perApur, LocalDate dtReceb) {
        this.codCont = codCont;
        this.vlContAputDifer = vlContAputDifer;
        this.natCredDesc = natCredDesc;
        this.vlCredDescDifer = vlCredDescDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.perApur = perApur;
        this.dtReceb = dtReceb;
    }

    public RegM300(){}

    public String getReg() {
        return reg;
    }

    public String getCodCont() {
        return codCont;
    }

    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }

    public BigDecimal getVlContAputDifer() {
        return vlContAputDifer;
    }

    public void setVlContAputDifer(BigDecimal vlContAputDifer) {
        this.vlContAputDifer = vlContAputDifer;
    }

    public String getNatCredDesc() {
        return natCredDesc;
    }

    public void setNatCredDesc(String natCredDesc) {
        this.natCredDesc = natCredDesc;
    }

    public BigDecimal getVlCredDescDifer() {
        return vlCredDescDifer;
    }

    public void setVlCredDescDifer(BigDecimal vlCredDescDifer) {
        this.vlCredDescDifer = vlCredDescDifer;
    }

    public BigDecimal getVlContDiferAnt() {
        return vlContDiferAnt;
    }

    public void setVlContDiferAnt(BigDecimal vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }

    public LocalDate getPerApur() {
        return perApur;
    }

    public void setPerApur(LocalDate perApur) {
        this.perApur = perApur;
    }

    public LocalDate getDtReceb() {
        return dtReceb;
    }

    public void setDtReceb(LocalDate dtReceb) {
        this.dtReceb = dtReceb;
    }
    
}
