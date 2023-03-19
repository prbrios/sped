package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK301;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK302;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegK300 implements Serializable {
	private static final long serialVersionUID = 8742682163559571815L;

	@Inclui
    private final String reg = "K300";

    @Inclui
    private LocalDate dtProd;

    @Filho
    private List<RegK301> regK301;

    @Filho
    private List<RegK302> regK302;

    public RegK300(LocalDate dtProd) {
        this.dtProd = dtProd;
    }

    public RegK300(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtProd() {
        return dtProd;
    }

    public void setDtProd(LocalDate dtProd) {
        this.dtProd = dtProd;
    }

    public List<RegK301> getRegK301() {
        return regK301;
    }

    public void setRegK301(List<RegK301> regK301) {
        this.regK301 = regK301;
    }

    public List<RegK302> getRegK302() {
        return regK302;
    }

    public void setRegK302(List<RegK302> regK302) {
        this.regK302 = regK302;
    }
    
}