package efd.ecd.blocoJ.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegJ800 implements Serializable {
	private static final long serialVersionUID = 7455611515001517627L;

	@Getter @Inclui
    private final String reg = "J800";

    @Getter @Setter @Inclui
    private String tipoDoc;

    @Getter @Setter @Inclui
    private String descRtf;

    @Getter @Setter @Inclui
    private String hashRtf;

    @Getter @Setter @Inclui
    private String arqRtf;

    @Getter @Setter @Inclui
    private String indFimRtf;

    public RegJ800() {}
    
    public RegJ800(String tipoDoc, String descRtf, String hashRtf, String arqRtf, String indFimRtf) {
        this.tipoDoc = tipoDoc;
        this.descRtf = descRtf;
        this.hashRtf = hashRtf;
        this.arqRtf = arqRtf;
        this.indFimRtf = indFimRtf;
    }

}
