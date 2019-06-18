package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1975;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class Reg1970 {

    @Getter @Inclui
    private final String reg = "1970";

    @Getter @Setter @Inclui
    private String indAp;

    @Getter @Setter @Inclui
    private BigDecimal g301;

    @Getter @Setter @Inclui
    private BigDecimal g302;

    @Getter @Setter @Inclui
    private BigDecimal g303;

    @Getter @Setter @Inclui
    private BigDecimal g304;

    @Getter @Setter @Inclui
    private BigDecimal g305;

    @Getter @Setter @Inclui
    private BigDecimal g306;

    @Getter @Setter @Inclui
    private BigDecimal g307;

    @Getter @Setter @Inclui
    private BigDecimal g3T;

    @Getter @Setter @Inclui
    private BigDecimal g308;

    @Getter @Setter @Inclui
    private BigDecimal g309;

    @Getter @Setter @Filho
    private List<Reg1975> reg1975;

    public Reg1970(String indAp) {
        this.indAp = indAp;
    }

    public Reg1970(){}
}