package efd;

import efd.anotacoes.Filho;
import efd.icmsipi.Bloco0000;
import efd.icmsipi.Bloco9999;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IcmsIpi {

    @Filho
    private Bloco0000 bloco0000;

    @Filho
    private Bloco9999 bloco9999;

}
