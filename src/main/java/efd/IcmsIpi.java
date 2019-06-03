package efd;

import efd.anotacoes.Filho;
import efd.icmsipi.bloco0.Reg0000;
import efd.icmsipi.bloco9.Reg9999;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IcmsIpi {

    @Filho
    private Reg0000 reg0000;

    @Filho
    private Reg9999 reg9999;

}
