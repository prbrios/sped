package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1900 {

    @Inclui
    private final String reg = "1900";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer subSer;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private BigDecimal vltotRec;

    @Inclui
    private Integer quantDoc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String infCompl;

    @Inclui
    private String codCta;

}
