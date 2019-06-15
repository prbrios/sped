package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegM215 {

    @Inclui
    private final String reg = "M215";

    @Inclui
    private String indAjBc;

    @Inclui
    private BigDecimal vlAjBc;

    @Inclui
    private String codAjBc;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAjBc;

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private String codCta;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String infoCompl;

}
