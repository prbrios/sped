package efd.contribuicoes.blocoF.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegF010 implements Serializable {
	private static final long serialVersionUID = 8838775355613132003L;

	@Getter @Inclui
	private final String reg = "F010";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Filho
    private List<RegF100> regF100;

    @Getter @Setter @Filho
    private List<RegF120> regF120;

    @Getter @Setter @Filho
    private List<RegF130> regF130;

    @Getter @Setter @Filho
    private List<RegF150> regF150;

    @Getter @Setter @Filho
    private List<RegF200> regF200;

    @Getter @Setter @Filho
    private List<RegF500> regF500;

    @Getter @Setter @Filho
    private List<RegF510> regF510;

    @Getter @Setter @Filho
    private List<RegF525> regF525;

    @Getter @Setter @Filho
    private List<RegF550> regF550;

    @Getter @Setter @Filho
    private List<RegF560> regF560;

    @Getter @Setter @Filho
    private List<RegF600> regF600;

    @Getter @Setter @Filho
    private List<RegF700> regF700;

    @Getter @Setter @Filho
    private List<RegF800> regF800;

    public RegF010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegF010(){ }
}
