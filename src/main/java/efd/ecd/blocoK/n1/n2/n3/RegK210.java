package efd.ecd.blocoK.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegK210 implements Serializable {
	private static final long serialVersionUID = -4139218768797150719L;

	@Inclui
    private final String reg = "K210";
    
    @Inclui
    private Integer codEmp;

    @Inclui
    private String codCtaEmp;

    public RegK210(Integer codEmp, String codCtaEmp) {
        this.codEmp = codEmp;
        this.codCtaEmp = codCtaEmp;
    }
    
    public RegK210() {}

    public String getReg() {
        return reg;
    }

    public Integer getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public String getCodCtaEmp() {
        return codCtaEmp;
    }

    public void setCodCtaEmp(String codCtaEmp) {
        this.codCtaEmp = codCtaEmp;
    }
    
    
}
