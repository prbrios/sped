package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC115 {

    @Inclui
    private final String reg = "C115";

    @Inclui
    private Integer indCarga;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCol;

    @Inclui
    private String ieCol;

    @Inclui(zerosEsquerda = 11)
    private Long cpfCol;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjEntg;

    @Inclui
    private String ieEntg;

    @Inclui(zerosEsquerda = 11)
    private Integer cpfEntg;

    @Inclui(zerosEsquerda = 7)
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
