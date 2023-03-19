package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;

public class RegJ930 implements Serializable {
	private static final long serialVersionUID = 5155039572809760959L;

	@Inclui
    private final String reg = "J930";

    @Inclui
    private String identNom;

    @Inclui
    private String identCpfCnpj;

    @Inclui
    private String identQualif;

    @Inclui
    private String codAssin;

    @Inclui
    private String indCrc;

    @Inclui
    private String email;

    @Inclui
    private String fone;

    @Inclui
    private String ufCrc;

    @Inclui
    private String numSeqCrc;

    @Inclui
    private LocalDate dtCrc;

    @Inclui
    private String indRespLegal;

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

    public RegJ930() {}

    public String getReg() {
        return reg;
    }

    public String getIdentNom() {
        return identNom;
    }

    public void setIdentNom(String identNom) {
        this.identNom = identNom;
    }

    public String getIdentCpfCnpj() {
        return identCpfCnpj;
    }

    public void setIdentCpfCnpj(String identCpfCnpj) {
        this.identCpfCnpj = identCpfCnpj;
    }

    public String getIdentQualif() {
        return identQualif;
    }

    public void setIdentQualif(String identQualif) {
        this.identQualif = identQualif;
    }

    public String getCodAssin() {
        return codAssin;
    }

    public void setCodAssin(String codAssin) {
        this.codAssin = codAssin;
    }

    public String getIndCrc() {
        return indCrc;
    }

    public void setIndCrc(String indCrc) {
        this.indCrc = indCrc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getUfCrc() {
        return ufCrc;
    }

    public void setUfCrc(String ufCrc) {
        this.ufCrc = ufCrc;
    }

    public String getNumSeqCrc() {
        return numSeqCrc;
    }

    public void setNumSeqCrc(String numSeqCrc) {
        this.numSeqCrc = numSeqCrc;
    }

    public LocalDate getDtCrc() {
        return dtCrc;
    }

    public void setDtCrc(LocalDate dtCrc) {
        this.dtCrc = dtCrc;
    }

    public String getIndRespLegal() {
        return indRespLegal;
    }

    public void setIndRespLegal(String indRespLegal) {
        this.indRespLegal = indRespLegal;
    }
    

}
