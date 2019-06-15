package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF525 {

    @Inclui
    private final String reg = "F525";

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private String indRec;

    @Inclui
    private String cnpjCpf;

    @Inclui
    private String numDoc;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlRecDet;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private String infoComp;

    @Inclui
    private String codCta;

}
