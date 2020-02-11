package efd.contribuicoes.bloco1.n1.n2;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1050 {

    @Getter @Inclui
private final String reg = "1050";

    @Getter @Setter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Inclui
    private String indAjBc;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst01;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst02;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst03;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst04;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst05;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst06;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst07;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst08;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst09;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst49;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCst99;

    @Getter @Setter @Inclui
    private String indAprop;

    @Getter @Setter @Inclui
    private String numRec;

    @Getter @Setter @Inclui
    private String infoCompl;

    public Reg1050(LocalDate dtRef, String indAjBc, Long cnpj, BigDecimal vlAjCst01, BigDecimal vlAjCst02, BigDecimal vlAjCst03, BigDecimal vlAjCst04, BigDecimal vlAjCst05, BigDecimal vlAjCst06, BigDecimal vlAjCst07, BigDecimal vlAjCst08, BigDecimal vlAjCst09, BigDecimal vlAjCst49, BigDecimal vlAjCst99, String indAprop, String numRec, String infoCompl) {
        this.dtRef = dtRef;
        this.indAjBc = indAjBc;
        this.cnpj = cnpj;
        this.vlAjCst01 = vlAjCst01;
        this.vlAjCst02 = vlAjCst02;
        this.vlAjCst03 = vlAjCst03;
        this.vlAjCst04 = vlAjCst04;
        this.vlAjCst05 = vlAjCst05;
        this.vlAjCst06 = vlAjCst06;
        this.vlAjCst07 = vlAjCst07;
        this.vlAjCst08 = vlAjCst08;
        this.vlAjCst09 = vlAjCst09;
        this.vlAjCst49 = vlAjCst49;
        this.vlAjCst99 = vlAjCst99;
        this.indAprop = indAprop;
        this.numRec = numRec;
        this.infoCompl = infoCompl;
    }

    public Reg1050(){ }
}
