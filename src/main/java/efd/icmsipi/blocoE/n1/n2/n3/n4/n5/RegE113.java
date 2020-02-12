package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE113 {

    @Getter @Inclui
    private final String reg = "E113";

    @Getter @Setter @Inclui
    private String codPart;

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
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlAjItem;

    @Getter @Setter @Inclui
    private String chvDoce;

    public RegE113(String codPart, String codMod, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, String codItem, BigDecimal vlAjItem, String chvDoce) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
        this.vlAjItem = vlAjItem;
        this.chvDoce = chvDoce;
    }

    public RegE113(){}
}