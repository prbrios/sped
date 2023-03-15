package efd;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.icmsipi.bloco0.Reg0000;
import efd.icmsipi.bloco9.Reg9999;
import lombok.Getter;
import lombok.Setter;


public class IcmsIpi implements Serializable {
	private static final long serialVersionUID = 7830523204647076256L;

	@Getter @Setter @Filho
    private Reg0000 reg0000;

    @Getter @Setter @Filho
    private Reg9999 reg9999;

}
