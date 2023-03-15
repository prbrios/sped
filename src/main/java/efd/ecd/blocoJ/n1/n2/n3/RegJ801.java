package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ801 implements Serializable {
	private static final long serialVersionUID = -3568615117424125504L;

	@Getter @Inclui
    private final String reg = "J801";

    @Getter @Setter @Inclui
    private String tipoDoc;

    @Getter @Setter @Inclui
    private String descRtf;

    @Getter @Setter @Inclui
    private String codMotSubs;

    @Getter @Setter @Inclui
    private String hashRtf;

    @Getter @Setter @Inclui
    private String arqRtf;

    @Getter @Setter @Inclui
    private String indFimRtf;

    public RegJ801(){
        this.indFimRtf = "J801FIM";
    }

    public RegJ801(String tipoDoc, String descRtf, String codMotSubs, String hashRtf, String arqRtf, String indFimRtf) {
        this.tipoDoc = tipoDoc;
        this.descRtf = descRtf;
        this.codMotSubs = codMotSubs;
        this.hashRtf = hashRtf;
        this.arqRtf = arqRtf;
        this.indFimRtf = indFimRtf;
    }

}
