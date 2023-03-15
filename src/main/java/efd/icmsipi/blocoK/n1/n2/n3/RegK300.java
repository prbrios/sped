package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK301;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK302;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegK300 implements Serializable {
	private static final long serialVersionUID = 8742682163559571815L;

	@Getter @Inclui
    private final String reg = "K300";

    @Getter @Setter @Inclui
    private LocalDate dtProd;

    @Getter @Setter @Filho
    private List<RegK301> regK301;

    @Getter @Setter @Filho
    private List<RegK302> regK302;

    public RegK300(LocalDate dtProd) {
        this.dtProd = dtProd;
    }

    public RegK300(){}
}