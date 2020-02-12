package efd.contribuicoes.blocoD.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD201;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD205;
import efd.contribuicoes.blocoD.n1.n2.n3.n4.RegD209;
import lombok.Getter;
import lombok.Setter;

public class RegD200 {

    @Getter @Inclui
private final String reg = "D200";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String sub;

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Filho
    private List<RegD201> regD201;

    @Getter @Setter @Filho
    private List<RegD205> regD205;

    @Getter @Setter @Filho
    private List<RegD209> regD209;

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
