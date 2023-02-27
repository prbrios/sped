package efd.ecd.blocoJ.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ932 {
    
    @Getter @Inclui
    private final String reg = "J932";

    @Getter @Setter @Inclui
    private String identNomT;

    @Getter @Setter @Inclui
    private String identCpfCnpjT;

    @Getter @Setter @Inclui
    private String identQualifT;

    @Getter @Setter @Inclui
    private String codAssinT;

    @Getter @Setter @Inclui
    private String indCrcT;

    @Getter @Setter @Inclui
    private String emailT;

    @Getter @Setter @Inclui
    private String foneT;

    @Getter @Setter @Inclui
    private String ufCrcT;

    @Getter @Setter @Inclui
    private String numSeqCrcT;

    @Getter @Setter @Inclui
    private LocalDate dtCrcT;

    public RegJ932() {}

    public RegJ932(String identNomT, String identCpfCnpjT, String identQualifT, String codAssinT, String indCrcT,
            String emailT, String foneT, String ufCrcT, String numSeqCrcT, LocalDate dtCrcT) {
        this.identNomT = identNomT;
        this.identCpfCnpjT = identCpfCnpjT;
        this.identQualifT = identQualifT;
        this.codAssinT = codAssinT;
        this.indCrcT = indCrcT;
        this.emailT = emailT;
        this.foneT = foneT;
        this.ufCrcT = ufCrcT;
        this.numSeqCrcT = numSeqCrcT;
        this.dtCrcT = dtCrcT;
    }

}
