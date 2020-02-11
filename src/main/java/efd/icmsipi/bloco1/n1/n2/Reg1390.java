package efd.icmsipi.bloco1.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1391;
import lombok.Getter;
import lombok.Setter;


public class Reg1390 {

    @Getter @Inclui
    private final String reg = "1390";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codProd;

    @Getter @Setter @Filho
    private List<Reg1391> reg1391;

    public Reg1390(Integer codProd) {
        this.codProd = codProd;
    }

    public Reg1390(){}
}