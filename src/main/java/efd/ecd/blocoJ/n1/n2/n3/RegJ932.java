package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;

public class RegJ932 implements Serializable {
	private static final long serialVersionUID = -3687407120725265367L;

	@Inclui
    private final String reg = "J932";

    @Inclui
    private String identNomT;

    @Inclui
    private String identCpfCnpjT;

    @Inclui
    private String identQualifT;

    @Inclui
    private String codAssinT;

    @Inclui
    private String indCrcT;

    @Inclui
    private String emailT;

    @Inclui
    private String foneT;

    @Inclui
    private String ufCrcT;

    @Inclui
    private String numSeqCrcT;

    @Inclui
    private LocalDate dtCrcT;

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

    public RegJ932() {}

    public String getReg() {
        return reg;
    }

    public String getIdentNomT() {
        return identNomT;
    }

    public void setIdentNomT(String identNomT) {
        this.identNomT = identNomT;
    }

    public String getIdentCpfCnpjT() {
        return identCpfCnpjT;
    }

    public void setIdentCpfCnpjT(String identCpfCnpjT) {
        this.identCpfCnpjT = identCpfCnpjT;
    }

    public String getIdentQualifT() {
        return identQualifT;
    }

    public void setIdentQualifT(String identQualifT) {
        this.identQualifT = identQualifT;
    }

    public String getCodAssinT() {
        return codAssinT;
    }

    public void setCodAssinT(String codAssinT) {
        this.codAssinT = codAssinT;
    }

    public String getIndCrcT() {
        return indCrcT;
    }

    public void setIndCrcT(String indCrcT) {
        this.indCrcT = indCrcT;
    }

    public String getEmailT() {
        return emailT;
    }

    public void setEmailT(String emailT) {
        this.emailT = emailT;
    }

    public String getFoneT() {
        return foneT;
    }

    public void setFoneT(String foneT) {
        this.foneT = foneT;
    }

    public String getUfCrcT() {
        return ufCrcT;
    }

    public void setUfCrcT(String ufCrcT) {
        this.ufCrcT = ufCrcT;
    }

    public String getNumSeqCrcT() {
        return numSeqCrcT;
    }

    public void setNumSeqCrcT(String numSeqCrcT) {
        this.numSeqCrcT = numSeqCrcT;
    }

    public LocalDate getDtCrcT() {
        return dtCrcT;
    }

    public void setDtCrcT(LocalDate dtCrcT) {
        this.dtCrcT = dtCrcT;
    }
    

}
