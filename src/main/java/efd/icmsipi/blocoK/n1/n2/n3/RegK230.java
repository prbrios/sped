package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK235;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegK230 implements Serializable {
	private static final long serialVersionUID = 1376141362506156402L;

	@Getter @Inclui
    private final String reg = "K230";

    @Getter @Setter @Inclui
    private LocalDate dtIniOp;

    @Getter @Setter @Inclui
    private LocalDate dtFinOp;

    @Getter @Setter @Inclui
    private String codDocOp;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdEnc;

    @Getter @Setter @Filho
    private List<RegK235> regK235;

    public RegK230(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp, String codItem, BigDecimal qtdEnc) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
        this.codItem = codItem;
        this.qtdEnc = qtdEnc;
    }

    public RegK230(){}
}