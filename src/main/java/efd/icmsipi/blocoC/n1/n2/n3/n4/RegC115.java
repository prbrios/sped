package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC115 implements Serializable {
	private static final long serialVersionUID = -2210792766552499730L;

	@Getter @Inclui
    private final String reg = "C115";

    @Getter @Setter @Inclui
    private Integer indCarga;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjCol;

    @Getter @Setter @Inclui
    private String ieCol;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpfCol;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjEntg;

    @Getter @Setter @Inclui
    private String ieEntg;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Integer cpfEntg;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunEntg;

    public RegC115(Integer indCarga, Long cnpjCol, String ieCol, Long cpfCol, Integer codMunCol, Long cnpjEntg, String ieEntg, Integer cpfEntg, Integer codMunEntg) {
        this.indCarga = indCarga;
        this.cnpjCol = cnpjCol;
        this.ieCol = ieCol;
        this.cpfCol = cpfCol;
        this.codMunCol = codMunCol;
        this.cnpjEntg = cnpjEntg;
        this.ieEntg = ieEntg;
        this.cpfEntg = cpfEntg;
        this.codMunEntg = codMunEntg;
    }

    public RegC115(){}
}
