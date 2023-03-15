package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD161 implements Serializable {
	private static final long serialVersionUID = 6669430072190846232L;

	@Getter @Inclui
    private final String reg = "D161";

    @Getter @Setter @Inclui
    private Integer indCarga;

    @Getter @Setter @Inclui
    private String cnpjCpfCol;

    @Getter @Setter @Inclui
    private String ieCol;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunCol;

    @Getter @Setter @Inclui
    private String cnpjCpfEntg;

    @Getter @Setter @Inclui
    private String ieEntg;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
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