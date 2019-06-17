package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC396;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC395 {

    @Getter @Inclui
    private final String reg = "C395";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private String subSer;

    @Getter @Inclui
    private String numDoc;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Filho
    private List<RegC396> regC396;

    public RegC395(String codMod, String codPart, String ser, String subSer, String numDoc, LocalDate dtDoc, BigDecimal vlDoc) {
        this.codMod = codMod;
        this.codPart = codPart;
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
    }

    public RegC395(){ }
}
