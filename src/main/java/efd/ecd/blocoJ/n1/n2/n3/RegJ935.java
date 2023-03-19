package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegJ935 implements Serializable {
	private static final long serialVersionUID = 6035616080924718723L;

	@Inclui
    private final String reg = "J935";

    @Inclui
    private String niCpfCnpj;

    @Inclui
    private String nomeAuditorFirma;

    @Inclui
    private String codCvmAuditor;

    public RegJ935(String niCpfCnpj, String nomeAuditorFirma, String codCvmAuditor) {
        this.niCpfCnpj = niCpfCnpj;
        this.nomeAuditorFirma = nomeAuditorFirma;
        this.codCvmAuditor = codCvmAuditor;
    }

    public RegJ935() {}

    public String getReg() {
        return reg;
    }

    public String getNiCpfCnpj() {
        return niCpfCnpj;
    }

    public void setNiCpfCnpj(String niCpfCnpj) {
        this.niCpfCnpj = niCpfCnpj;
    }

    public String getNomeAuditorFirma() {
        return nomeAuditorFirma;
    }

    public void setNomeAuditorFirma(String nomeAuditorFirma) {
        this.nomeAuditorFirma = nomeAuditorFirma;
    }

    public String getCodCvmAuditor() {
        return codCvmAuditor;
    }

    public void setCodCvmAuditor(String codCvmAuditor) {
        this.codCvmAuditor = codCvmAuditor;
    }
    

}
