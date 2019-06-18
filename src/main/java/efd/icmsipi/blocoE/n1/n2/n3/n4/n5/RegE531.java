package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegE531 {

    @Getter @Inclui
    private final String reg = "E531";

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
    private BigDecimal vlAjitem;

    @Getter @Setter @Inclui
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