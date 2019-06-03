package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegD180 {

    @Inclui
    private final String reg = "D180";

    @Inclui
    private Integer numSeq;

    @Inclui
    private String indEmit;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjCpfEmit;

    @Inclui
    private String ufEmit;

    @Inclui
    private String ieEmit;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private Long cnpjCpfTom;

    @Inclui
    private String ufTom;

    @Inclui
    private String ieTom;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    public RegD180(Integer numSeq, String indEmit, Long cnpjCpfEmit, String ufEmit, String ieEmit, Integer codMunOrig, Long cnpjCpfTom, String ufTom, String ieTom, Integer codMunDest, String codMod, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, BigDecimal vlDoc) {
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