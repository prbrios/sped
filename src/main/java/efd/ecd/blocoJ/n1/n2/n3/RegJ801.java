package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegJ801 implements Serializable {
	private static final long serialVersionUID = -3568615117424125504L;

	@Inclui
    private final String reg = "J801";

    @Inclui
    private String tipoDoc;

    @Inclui
    private String descRtf;

    @Inclui
    private String codMotSubs;

    @Inclui
    private String hashRtf;

    @Inclui
    private String arqRtf;

    @Inclui
    private String indFimRtf;

    public RegJ801(String tipoDoc, String descRtf, String codMotSubs, String hashRtf, String arqRtf, String indFimRtf) {
        this.tipoDoc = tipoDoc;
        this.descRtf = descRtf;
        this.codMotSubs = codMotSubs;
        this.hashRtf = hashRtf;
        this.arqRtf = arqRtf;
        this.indFimRtf = indFimRtf;
    }

    public RegJ801(){
        this.indFimRtf = "J801FIM";
    }

    public String getReg() {
        return reg;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDescRtf() {
        return descRtf;
    }

    public void setDescRtf(String descRtf) {
        this.descRtf = descRtf;
    }

    public String getCodMotSubs() {
        return codMotSubs;
    }

    public void setCodMotSubs(String codMotSubs) {
        this.codMotSubs = codMotSubs;
    }

    public String getHashRtf() {
        return hashRtf;
    }

    public void setHashRtf(String hashRtf) {
        this.hashRtf = hashRtf;
    }

    public String getArqRtf() {
        return arqRtf;
    }

    public void setArqRtf(String arqRtf) {
        this.arqRtf = arqRtf;
    }

    public String getIndFimRtf() {
        return indFimRtf;
    }

    public void setIndFimRtf(String indFimRtf) {
        this.indFimRtf = indFimRtf;
    }
    

}
