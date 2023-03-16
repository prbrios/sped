package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class RegE313 implements Serializable {
	private static final long serialVersionUID = 7861965339176572211L;

	@Getter @Inclui
    private final String reg = "E313";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer sub;

    @Getter @Setter @Inclui
    private Long numDoc;

    @Getter @Setter @Inclui
    private String chvDoce;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlAjItem;

    public RegE313(String codPart, String codMod, String ser, Integer sub, Long numDoc, String chvDoce, LocalDate dtDoc, String codItem, BigDecimal vlAjItem) {
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