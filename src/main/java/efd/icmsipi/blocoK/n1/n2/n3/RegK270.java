package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK275;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegK270 implements Serializable {
	private static final long serialVersionUID = 3047079200771503228L;

	@Inclui
    private final String reg = "K270";

    @Inclui
    private LocalDate dtIniAp;

    @Inclui
    private LocalDate dtFinAp;

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Inclui
    private String origem;

    @Filho
    private List<RegK275> regK275;

    public RegK270(LocalDate dtIniAp, LocalDate dtFinAp, String codOpOs, String codItem, BigDecimal qtdCorPos, BigDecimal qtdCorNeg, String origem) {
        this.dtIniAp = dtIniAp;
        this.dtFinAp = dtFinAp;
        this.codOpOs = codOpOs;
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCorNeg = qtdCorNeg;
        this.origem = origem;
    }

    public RegK270(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIniAp() {
        return dtIniAp;
    }

    public void setDtIniAp(LocalDate dtIniAp) {
        this.dtIniAp = dtIniAp;
    }

    public LocalDate getDtFinAp() {
        return dtFinAp;
    }

    public void setDtFinAp(LocalDate dtFinAp) {
        this.dtFinAp = dtFinAp;
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

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }

    public void setQtdCorNeg(BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public List<RegK275> getRegK275() {
        return regK275;
    }

    public void setRegK275(List<RegK275> regK275) {
        this.regK275 = regK275;
    }
    
}