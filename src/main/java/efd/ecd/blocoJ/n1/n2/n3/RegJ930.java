package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ930 implements Serializable {
	private static final long serialVersionUID = 5155039572809760959L;

	@Getter @Inclui
    private final String reg = "J930";

    @Getter @Setter @Inclui
    private String identNom;

    @Getter @Setter @Inclui
    private String identCpfCnpj;

    @Getter @Setter @Inclui
    private String identQualif;

    @Getter @Setter @Inclui
    private String codAssin;

    @Getter @Setter @Inclui
    private String indCrc;

    @Getter @Setter @Inclui
    private String email;

    @Getter @Setter @Inclui
    private String fone;

    @Getter @Setter @Inclui
    private String ufCrc;

    @Getter @Setter @Inclui
    private String numSeqCrc;

    @Getter @Setter @Inclui
    private LocalDate dtCrc;

    @Getter @Setter @Inclui
    private String indRespLegal;

    public RegJ930() {}

    public RegJ930(String identNom, String identCpfCnpj, String identQualif, String codAssin, String indCrc,
            String email, String fone, String ufCrc, String numSeqCrc, LocalDate dtCrc, String indRespLegal) {
        this.identNom = identNom;
        this.identCpfCnpj = identCpfCnpj;
        this.identQualif = identQualif;
        this.codAssin = codAssin;
        this.indCrc = indCrc;
        this.email = email;
        this.fone = fone;
        this.ufCrc = ufCrc;
        this.numSeqCrc = numSeqCrc;
        this.dtCrc = dtCrc;
        this.indRespLegal = indRespLegal;
    }

}
