package efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class Reg1923 implements Serializable {
	private static final long serialVersionUID = 384761780785771068L;

	@Getter @Inclui
    private final String reg = "1923";

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
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlAjItem;

    @Getter @Setter @Inclui
    private String chvDoce;

    public Reg1923(String codPart, String codMod, String ser, Integer sub, Long numDoc, LocalDate dtDoc, String codItem, BigDecimal vlAjItem, String chvDoce) {
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

    public Reg1923(){}
}