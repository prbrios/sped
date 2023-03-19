package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegJ800 implements Serializable {
	private static final long serialVersionUID = 7455611515001517627L;

	@Inclui
    private final String reg = "J800";

    @Inclui
    private String tipoDoc;

    @Inclui
    private String descRtf;

    @Inclui
    private String hashRtf;

    @Inclui
    private String arqRtf;

    @Inclui
    private String indFimRtf;

    public RegJ800(String tipoDoc, String descRtf, String hashRtf, String arqRtf, String indFimRtf) {
        this.tipoDoc = tipoDoc;
        this.descRtf = descRtf;
        this.hashRtf = hashRtf;
        this.arqRtf = arqRtf;
        this.indFimRtf = indFimRtf;
    }
    
    public RegJ800() {}

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
