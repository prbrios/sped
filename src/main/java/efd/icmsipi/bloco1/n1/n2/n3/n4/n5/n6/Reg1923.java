package efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1923 {

    @Inclui
    private final String reg = "1923";

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
    private BigDecimal vlAjItem;

    @Inclui
    private String chvDoce;

}