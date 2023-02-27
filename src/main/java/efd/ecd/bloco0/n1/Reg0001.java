package efd.ecd.bloco0.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.bloco0.n1.n2.Reg0007;
import efd.ecd.bloco0.n1.n2.Reg0020;
import efd.ecd.bloco0.n1.n2.Reg0035;
import efd.ecd.bloco0.n1.n2.Reg0150;
import lombok.Getter;
import lombok.Setter;

public class Reg0001 {
    
    @Getter @Inclui
    private final String reg = "0001";

    @Getter @Setter @Inclui
    private Integer indDad;

    @Getter @Setter @Filho
    private List<Reg0007> reg0007;

    @Getter @Setter @Filho
    private List<Reg0020> reg0020;

    @Getter @Setter @Filho
    private List<Reg0035> reg0035;
    
    @Getter @Setter @Filho
    private List<Reg0150> reg0150;
    

    public Reg0001(Integer indDad) {
        this.indDad = indDad;
    }

    public Reg0001(){}
}
