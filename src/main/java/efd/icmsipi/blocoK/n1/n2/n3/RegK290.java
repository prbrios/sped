package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK291;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK292;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegK290 implements Serializable {
	private static final long serialVersionUID = -4942167884255288342L;

	@Getter @Inclui
    private final String reg = "K290";

    @Getter @Setter @Inclui
    private LocalDate dtIniOp;

    @Getter @Setter @Inclui
    private LocalDate dtFinOp;

    @Getter @Setter @Inclui
    private String codDocOp;

    @Getter @Setter @Filho
    private List<RegK291> regK291;

    @Getter @Setter @Filho
    private List<RegK292> regK292;

    public RegK290(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
    }

    public RegK290(){}
}