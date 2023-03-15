package efd.ecd.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0020 implements Serializable {
	private static final long serialVersionUID = -1480265738284401174L;

	@Getter @Inclui
    private final String reg = "0020";

    @Getter @Setter @Inclui
    private Integer indDec;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private String ie;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Setter @Inclui
    private String im;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long nire;

    public Reg0020(Integer indDec, Long cnpj, String uf, String ie, Integer codMun, String im, Long nire) {
        this.indDec = indDec;
        this.cnpj = cnpj;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.nire = nire;
    }

    public Reg0020(){/* */}
    
}
