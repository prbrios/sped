package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK215;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegK210 implements Serializable {
	private static final long serialVersionUID = 1045256751303446522L;

	@Inclui
    private final String reg = "K210";

    @Inclui
    private LocalDate dtIniOs;

    @Inclui
    private LocalDate dtFinOs;

    @Inclui
    private String codDocOs;

    @Inclui
    private String codItemOri;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Filho
    private List<RegK215> regK215;

    public RegK210(LocalDate dtIniOs, LocalDate dtFinOs, String codDocOs, String codItemOri, BigDecimal qtdOri) {
        this.dtIniOs = dtIniOs;
        this.dtFinOs = dtFinOs;
        this.codDocOs = codDocOs;
        this.codItemOri = codItemOri;
        this.qtdOri = qtdOri;
    }

    public RegK210(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIniOs() {
        return dtIniOs;
    }

    public void setDtIniOs(LocalDate dtIniOs) {
        this.dtIniOs = dtIniOs;
    }

    public LocalDate getDtFinOs() {
        return dtFinOs;
    }

    public void setDtFinOs(LocalDate dtFinOs) {
        this.dtFinOs = dtFinOs;
    }

    public String getCodDocOs() {
        return codDocOs;
    }

    public void setCodDocOs(String codDocOs) {
        this.codDocOs = codDocOs;
    }

    public String getCodItemOri() {
        return codItemOri;
    }

    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }

    public BigDecimal getQtdOri() {
        return qtdOri;
    }

    public void setQtdOri(BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
    }

    public List<RegK215> getRegK215() {
        return regK215;
    }

    public void setRegK215(List<RegK215> regK215) {
        this.regK215 = regK215;
    }
    
}