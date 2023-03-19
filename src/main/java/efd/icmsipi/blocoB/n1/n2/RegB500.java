package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.RegB510;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegB500 implements Serializable {
	private static final long serialVersionUID = -3629741819461280186L;

	@Inclui
    private final String reg = "B500";

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private Integer qtdProf;

    @Inclui
    private BigDecimal vlOr;

    @Filho
    private List<RegB510> regB510;

    public RegB500(BigDecimal vlRec, Integer qtdProf, BigDecimal vlOr) {
        this.vlRec = vlRec;
        this.qtdProf = qtdProf;
        this.vlOr = vlOr;
    }

    public RegB500(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public Integer getQtdProf() {
        return qtdProf;
    }

    public void setQtdProf(Integer qtdProf) {
        this.qtdProf = qtdProf;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
    }

    public List<RegB510> getRegB510() {
        return regB510;
    }

    public void setRegB510(List<RegB510> regB510) {
        this.regB510 = regB510;
    }
    
}
