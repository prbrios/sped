package efd.icmsipi.blocoG.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegG140 {

    @Inclui
    private final String reg = "G140";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    public RegG140(Integer numItem, String codItem) {
        this.numItem = numItem;
        this.codItem = codItem;
    }

    public RegG140(){}
}