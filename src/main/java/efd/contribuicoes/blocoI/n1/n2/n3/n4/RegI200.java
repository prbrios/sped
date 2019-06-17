package efd.contribuicoes.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoI.n1.n2.RegI010;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.RegI299;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.RegI300;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class RegI200 {

    @Getter @Inclui
    private final String reg = "I200";

    @Getter @Inclui
    private String numCampo;

    @Getter @Inclui
    private String codDet;

    @Getter @Inclui
    private BigDecimal detValor;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String infoCompl;


    @Getter @Setter @Filho
    private List<RegI299> regI299;

    @Getter @Setter @Filho
    private List<RegI300> regI300;

    public RegI200(String numCampo, String codDet, BigDecimal detValor, String codCta, String infoCompl) {
        this.numCampo = numCampo;
        this.codDet = codDet;
        this.detValor = detValor;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegI200(){}
}
