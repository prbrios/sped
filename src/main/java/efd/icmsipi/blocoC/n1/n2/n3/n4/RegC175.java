package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC175 implements Serializable {
	private static final long serialVersionUID = 5809523151282628421L;

	@Getter @Inclui
    private final String reg = "C175";

    @Getter @Setter @Inclui
    private String indVeicOper;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private String chassiVeic;

    public RegC175(String indVeicOper, Long cnpj, String uf, String chassiVeic) {
        this.indVeicOper = indVeicOper;
        this.cnpj = cnpj;
        this.uf = uf;
        this.chassiVeic = chassiVeic;
    }

    public RegC175(){}
}
