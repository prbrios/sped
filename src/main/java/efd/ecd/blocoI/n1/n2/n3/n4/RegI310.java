package efd.ecd.blocoI.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI310 {

	@Getter @Inclui
	private static final String reg = "I310";
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private BigDecimal valDebd;
	
	@Getter @Setter @Inclui
	private BigDecimal valCredd;
	
	@Getter @Setter @Inclui
	private BigDecimal valDebMf;
	
	@Getter @Setter @Inclui
	private BigDecimal valCredMf;
	
	public RegI310(String codCta, String codCcus, BigDecimal valDebd, BigDecimal valCredd, BigDecimal valDebMf,
			BigDecimal valCredMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.valDebd = valDebd;
		this.valCredd = valCredd;
		this.valDebMf = valDebMf;
		this.valCredMf = valCredMf;
	}
	
	public RegI310() {/* */}
	
}
