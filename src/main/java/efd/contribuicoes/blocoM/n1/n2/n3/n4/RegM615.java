package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM615 {

    @Getter @Inclui
private final String reg = "M615";

    @Getter @Setter @Inclui
    private String indAjBc;

    @Getter @Setter @Inclui
    private BigDecimal vlAjBc;

    @Getter @Setter @Inclui
    private String codAjBc;

    @Getter @Setter @Inclui
    private String numDoc;

    @Getter @Setter @Inclui
    private String descrAjBc;

    @Getter @Setter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String infoCompl;

    public RegM615(String indAjBc, BigDecimal vlAjBc, String codAjBc, String numDoc, String descrAjBc, LocalDate dtRef, String codCta, Long cnpj, String infoCompl) {
        this.indAjBc = indAjBc;
        this.vlAjBc = vlAjBc;
        this.codAjBc = codAjBc;
        this.numDoc = numDoc;
        this.descrAjBc = descrAjBc;
        this.dtRef = dtRef;
        this.codCta = codCta;
        this.cnpj = cnpj;
        this.infoCompl = infoCompl;
    }

    public RegM615(){}
}
