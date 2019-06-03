package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegD161 {

    @Inclui
    private final String reg = "D161";

    @Inclui
    private Integer indCarga;

    @Inclui
    private String cnpjCpfCol;

    @Inclui
    private String ieCol;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Inclui
    private String cnpjCpfEntg;

    @Inclui
    private String ieEntg;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunEntg;

    public RegD161(Integer indCarga, String cnpjCpfCol, String ieCol, Integer codMunCol, String cnpjCpfEntg, String ieEntg, Integer codMunEntg) {
        this.indCarga = indCarga;
        this.cnpjCpfCol = cnpjCpfCol;
        this.ieCol = ieCol;
        this.codMunCol = codMunCol;
        this.cnpjCpfEntg = cnpjCpfEntg;
        this.ieEntg = ieEntg;
        this.codMunEntg = codMunEntg;
    }

    public RegD161(){}
}