package efd.contribuicoes.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegD010 implements Serializable {
	private static final long serialVersionUID = -8444845823414161389L;

	@Getter @Inclui
	private final String reg = "D010";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Filho
    private List<RegD100> regD100;

    @Getter @Setter @Filho
    private List<RegD200> regD200;

    @Getter @Setter @Filho
    private List<RegD300> regD300;

    @Getter @Setter @Filho
    private List<RegD350> regD350;

    @Getter @Setter @Filho
    private List<RegD500> regD500;

    @Getter @Setter @Filho
    private List<RegD600> regD600;

    public RegD010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegD010(){}
}
