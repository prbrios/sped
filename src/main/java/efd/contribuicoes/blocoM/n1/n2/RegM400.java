package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM410;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class RegM400 {

    @Getter @Inclui
private final String reg = "M400";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlTotRec;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    @Getter @Setter @Filho
    private List<RegM410> regM410;

    public RegM400(Integer cstPis, BigDecimal vlTotRec, String codCta, String descCompl) {
        this.cstPis = cstPis;
        this.vlTotRec = vlTotRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM400(){}
}
