package efd.ecd.blocoI.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI250;
import lombok.Getter;
import lombok.Setter;

public class RegI200 {

	@Getter @Inclui
	private static final String reg = "I200";
	
	@Getter @Setter @Inclui
	private String numLcto;
	
	@Getter @Setter @Inclui
	private LocalDate dtLcto;
	
	@Getter @Setter @Inclui
	private BigDecimal vlLcto;
	
	@Getter @Setter @Inclui
	private String indLcto;
	
	@Getter @Setter @Inclui
	private LocalDate dtLctoExt;
	
	@Getter @Setter @Inclui
	private BigDecimal vlLctoMf;

	@Getter @Setter @Filho
	private List<RegI250> regI250;
	
	public RegI200(String numLcto, LocalDate dtLcto, BigDecimal vlLcto, String indLcto, LocalDate dtLctoExt,
			BigDecimal vlLctoMf) {
		super();
		this.numLcto = numLcto;
		this.dtLcto = dtLcto;
		this.vlLcto = vlLcto;
		this.indLcto = indLcto;
		this.dtLctoExt = dtLctoExt;
		this.vlLctoMf = vlLctoMf;
	}
	
	public RegI200() {/* */}
	
}
