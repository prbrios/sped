package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK265;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegK260 implements Serializable {
	private static final long serialVersionUID = -2735415812502753790L;

	@Inclui
    private final String reg = "K260";

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtSaida;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdSaida;

    @Inclui
    private LocalDate dtRet;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;

    @Filho
    private List<RegK265> regK265;

    public RegK260(String codOpOs, String codItem, LocalDate dtSaida, BigDecimal qtdSaida, LocalDate dtRet, BigDecimal qtdRet) {
        this.codOpOs = codOpOs;
        this.codItem = codItem;
        this.dtSaida = dtSaida;
        this.qtdSaida = qtdSaida;
        this.dtRet = dtRet;
        this.qtdRet = qtdRet;
    }

    public RegK260(){}

    public String getReg() {
        return reg;
    }

    public String getCodOpOs() {
        return codOpOs;
    }

    public void setCodOpOs(String codOpOs) {
        this.codOpOs = codOpOs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public LocalDate getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(LocalDate dtSaida) {
        this.dtSaida = dtSaida;
    }

    public BigDecimal getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(BigDecimal qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public LocalDate getDtRet() {
        return dtRet;
    }

    public void setDtRet(LocalDate dtRet) {
        this.dtRet = dtRet;
    }

    public BigDecimal getQtdRet() {
        return qtdRet;
    }

    public void setQtdRet(BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
    }

    public List<RegK265> getRegK265() {
        return regK265;
    }

    public void setRegK265(List<RegK265> regK265) {
        this.regK265 = regK265;
    }
    
}