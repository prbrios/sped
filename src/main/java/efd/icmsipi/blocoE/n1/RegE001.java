package efd.icmsipi.blocoE.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.RegE100;
import efd.icmsipi.blocoE.n1.n2.RegE200;
import efd.icmsipi.blocoE.n1.n2.RegE300;
import efd.icmsipi.blocoE.n1.n2.RegE500;

import java.io.Serializable;
import java.util.List;

public class RegE001 implements Serializable {
	private static final long serialVersionUID = -8388569629222877436L;

	@Inclui
    private final String reg = "E001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegE100> regE100;

    @Filho
    private List<RegE200> regE200;

    @Filho
    private List<RegE300> regE300;

    @Filho
    private List<RegE500> regE500;

    public RegE001(String indMov) {
        this.indMov = indMov;
    }

    public RegE001(){}

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public List<RegE100> getRegE100() {
        return regE100;
    }

    public void setRegE100(List<RegE100> regE100) {
        this.regE100 = regE100;
    }

    public List<RegE200> getRegE200() {
        return regE200;
    }

    public void setRegE200(List<RegE200> regE200) {
        this.regE200 = regE200;
    }

    public List<RegE300> getRegE300() {
        return regE300;
    }

    public void setRegE300(List<RegE300> regE300) {
        this.regE300 = regE300;
    }

    public List<RegE500> getRegE500() {
        return regE500;
    }

    public void setRegE500(List<RegE500> regE500) {
        this.regE500 = regE500;
    }
    
}