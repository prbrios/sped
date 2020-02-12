package efd.icmsipi.blocoD.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD180 {

    @Getter @Inclui
    private final String reg = "D180";

    @Getter @Setter @Inclui
    private Integer numSeq;

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfEmit;

    @Getter @Setter @Inclui
    private String ufEmit;

    @Getter @Setter @Inclui
    private String ieEmit;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Getter @Setter @Inclui
    private String cnpjCpfTom;

    @Getter @Setter @Inclui
    private String ufTom;

    @Getter @Setter @Inclui
    private String ieTom;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    public RegD180(Integer numSeq, String indEmit, Long cnpjCpfEmit, String ufEmit, String ieEmit, Integer codMunOrig, String cnpjCpfTom, String ufTom, String ieTom, Integer codMunDest, String codMod, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, BigDecimal vlDoc) {
        this.numSeq = numSeq;
        this.indEmit = indEmit;
        this.cnpjCpfEmit = cnpjCpfEmit;
        this.ufEmit = ufEmit;
        this.ieEmit = ieEmit;
        this.codMunOrig = codMunOrig;
        this.cnpjCpfTom = cnpjCpfTom;
        this.ufTom = ufTom;
        this.ieTom = ieTom;
        this.codMunDest = codMunDest;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
    }

    public RegD180(){}
}