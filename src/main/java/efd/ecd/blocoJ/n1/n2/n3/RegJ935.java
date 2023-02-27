package efd.ecd.blocoJ.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ935 {
    
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
