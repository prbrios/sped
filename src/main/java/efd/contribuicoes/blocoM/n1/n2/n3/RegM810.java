package efd.contribuicoes.blocoM.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM810 {

    @Getter @Inclui
private final String reg = "M810";

    @Getter @Setter @Inclui
    private String natRec;

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String descCompl;

    public RegM810(String natRec, BigDecimal vlRec, String codCta, String descCompl) {
        this.natRec = natRec;
        this.vlRec = vlRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM810(){}
}
