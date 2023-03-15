package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ935 implements Serializable {
	private static final long serialVersionUID = 6035616080924718723L;

	@Getter @Inclui
    private final String reg = "J935";

    @Getter @Setter @Inclui
    private String niCpfCnpj;

    @Getter @Setter @Inclui
    private String nomeAuditorFirma;

    @Getter @Setter @Inclui
    private String codCvmAuditor;

    public RegJ935() {}

    public RegJ935(String niCpfCnpj, String nomeAuditorFirma, String codCvmAuditor) {
        this.niCpfCnpj = niCpfCnpj;
        this.nomeAuditorFirma = nomeAuditorFirma;
        this.codCvmAuditor = codCvmAuditor;
    }

}
