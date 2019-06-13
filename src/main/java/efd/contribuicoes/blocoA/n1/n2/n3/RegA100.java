package efd.contribuicoes.blocoA.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegA100 {

    @Inclui
    private final String reg = "A100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private String sub;

    @Inclui
    private String numDoc;

    @Inclui
    private String chvNfse;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtExeServ;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private String indPgto;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlbcPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal vlPisRet;

    @Inclui
    private BigDecimal vlCofinsRet;

    @Inclui
    private BigDecimal vlIss;

}
