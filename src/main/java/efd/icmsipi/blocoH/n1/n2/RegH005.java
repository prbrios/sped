package efd.icmsipi.blocoH.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.RegH010;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegH005 implements Serializable {
	private static final long serialVersionUID = 8152667946405500823L;

	@Inclui
    private final String reg = "H005";

    @Inclui
    private LocalDate dtInv;

    @Inclui
    private BigDecimal vlInv;

    @Inclui
    private String motInv;

    @Filho
    private List<RegH010> regH010;

    public RegH005(LocalDate dtInv, BigDecimal vlInv, String motInv) {
        this.dtInv = dtInv;
        this.vlInv = vlInv;
        this.motInv = motInv;
    }

    public RegH005(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtInv() {
        return dtInv;
    }

    public void setDtInv(LocalDate dtInv) {
        this.dtInv = dtInv;
    }

    public BigDecimal getVlInv() {
        return vlInv;
    }

    public void setVlInv(BigDecimal vlInv) {
        this.vlInv = vlInv;
    }

    public String getMotInv() {
        return motInv;
    }

    public void setMotInv(String motInv) {
        this.motInv = motInv;
    }

    public List<RegH010> getRegH010() {
        return regH010;
    }

    public void setRegH010(List<RegH010> regH010) {
        this.regH010 = regH010;
    }
    
}