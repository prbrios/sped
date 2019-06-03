package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegE313 {

    @Inclui
    private final String reg = "E313";

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvDoce;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlAjItem;

    public RegE313(String codPart, String codMod, String ser, Integer sub, Integer numDoc, String chvDoce, LocalDate dtDoc, String codItem, BigDecimal vlAjItem) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.chvDoce = chvDoce;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
        this.vlAjItem = vlAjItem;
    }

    public RegE313(){}
}