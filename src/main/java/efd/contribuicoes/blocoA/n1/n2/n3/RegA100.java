package efd.contribuicoes.blocoA.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegA100 {

    @Getter @Inclui
    private final String reg = "A100";

    @Getter @Inclui
    private String indOper;

    @Getter @Inclui
    private String indEmit;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private String sub;

    @Getter @Inclui
    private String numDoc;

    @Getter @Inclui
    private String chvNfse;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private LocalDate dtExeServ;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private String indPgto;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private BigDecimal vlbcPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private BigDecimal vlPisRet;

    @Getter @Inclui
    private BigDecimal vlCofinsRet;

    @Getter @Inclui
    private BigDecimal vlIss;

    public RegA100(String indOper, String indEmit, String codPart, Integer codSit, String ser, String sub, String numDoc, String chvNfse, LocalDate dtDoc, LocalDate dtExeServ, BigDecimal vlDoc, String indPgto, BigDecimal vlDesc, BigDecimal vlbcPis, BigDecimal vlPis, BigDecimal vlBcCofins, BigDecimal vlCofins, BigDecimal vlPisRet, BigDecimal vlCofinsRet, BigDecimal vlIss) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.chvNfse = chvNfse;
        this.dtDoc = dtDoc;
        this.dtExeServ = dtExeServ;
        this.vlDoc = vlDoc;
        this.indPgto = indPgto;
        this.vlDesc = vlDesc;
        this.vlbcPis = vlbcPis;
        this.vlPis = vlPis;
        this.vlBcCofins = vlBcCofins;
        this.vlCofins = vlCofins;
        this.vlPisRet = vlPisRet;
        this.vlCofinsRet = vlCofinsRet;
        this.vlIss = vlIss;
    }

    public RegA100(){ }
}
