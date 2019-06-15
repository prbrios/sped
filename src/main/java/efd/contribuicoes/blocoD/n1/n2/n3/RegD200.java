package efd.contribuicoes.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegD200 {

    @Getter @Inclui
    private final String reg = "D200";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private String sub;

    @Getter @Inclui
    private Integer numDocIni;

    @Getter @Inclui
    private Integer numDocFin;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private LocalDate dtRef;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Inclui
    private BigDecimal vlDesc;

    public RegD200(String codMod, Integer codSit, String ser, String sub, Integer numDocIni, Integer numDocFin, Integer cfop, LocalDate dtRef, BigDecimal vlDoc, BigDecimal vlDesc) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cfop = cfop;
        this.dtRef = dtRef;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
    }

    public RegD200(){}
}
