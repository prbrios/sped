package efd.icmsipi.blocoG.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegG140 {

    @Getter @Inclui
    private final String reg = "G140";

    @Getter @Setter @Inclui
    private Integer numItem;

    @Getter @Setter @Inclui
    private String codItem;

    public RegG140(Integer numItem, String codItem) {
        this.numItem = numItem;
        this.codItem = codItem;
    }

    public RegG140(){}
}