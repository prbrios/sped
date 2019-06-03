package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegE531 {

    @Inclui
    private final String reg = "E531";

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
    private LocalDate dtDoc;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlAjitem;

    @Inclui
    private String chvNfe;

    public RegE531(String codPart, String codMod, String ser, Integer sub, Integer numDoc, LocalDate dtDoc, String codItem, BigDecimal vlAjitem, String chvNfe) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
        this.vlAjitem = vlAjitem;
        this.chvNfe = chvNfe;
    }

    public RegE531(){}
}