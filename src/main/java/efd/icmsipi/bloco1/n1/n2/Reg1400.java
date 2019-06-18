package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Reg1400 {

    @Getter @Inclui
    private final String reg = "1400";

    @Getter @Setter @Inclui
    private String codItemImp;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer mun;

    @Getter @Setter @Inclui
    private BigDecimal valor;

    public Reg1400(String codItemImp, Integer mun, BigDecimal valor) {
        this.codItemImp = codItemImp;
        this.mun = mun;
        this.valor = valor;
    }

    public Reg1400(){}
}