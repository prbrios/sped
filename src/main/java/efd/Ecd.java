package efd;

import efd.anotacoes.Filho;
import efd.ecd.bloco0.Reg0000;
import efd.ecd.bloco9.Reg9999;
import lombok.Getter;
import lombok.Setter;

public class Ecd {
    
    @Getter @Setter @Filho
    private Reg0000 reg0000;
    
    @Getter @Setter @Filho
    private Reg9999 reg9999;

}
