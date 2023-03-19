package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM700 implements Serializable {
	private static final long serialVersionUID = -4998409983305497605L;

	@Inclui
	private final String reg = "M700";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlContApurDifer;

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

    public RegM700(String codCont, BigDecimal vlContApurDifer, String natCredDesc, BigDecimal vlCredDescDifer, BigDecimal vlContDiferAnt, LocalDate perApur, LocalDate dtReceb) {
        this.codCont = codCont;
        this.vlContApurDifer = vlContApurDifer;
        this.natCredDesc = natCredDesc;
        this.vlCredDescDifer = vlCredDescDifer;
        this.vlContDiferAnt = vlContDiferAnt;
        this.perApur = perApur;
        this.dtReceb = dtReceb;
    }

    public RegM700(){}

    public String getReg() {
        return reg;
    }

    public String getCodCont() {
        return codCont;
    }

    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }

    public BigDecimal getVlContApurDifer() {
        return vlContApurDifer;
    }

    public void setVlContApurDifer(BigDecimal vlContApurDifer) {
        this.vlContApurDifer = vlContApurDifer;
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
