package efd;

import efd.anotacoes.Filho;
import efd.icmsipi.bloco0.Reg0000;
import efd.icmsipi.bloco9.Reg9999;
import lombok.Getter;
import lombok.Setter;


public class IcmsIpi {

    @Getter @Setter @Filho
    private Reg0000 reg0000;

    @Getter @Setter @Filho
    private Reg9999 reg9999;

}
