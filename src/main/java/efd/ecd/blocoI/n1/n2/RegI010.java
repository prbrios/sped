package efd.ecd.blocoI.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.RegI012;
import efd.ecd.blocoI.n1.n2.n3.RegI020;
import efd.ecd.blocoI.n1.n2.n3.RegI030;
import efd.ecd.blocoI.n1.n2.n3.RegI050;
import efd.ecd.blocoI.n1.n2.n3.RegI075;
import efd.ecd.blocoI.n1.n2.n3.RegI100;
import efd.ecd.blocoI.n1.n2.n3.RegI150;
import efd.ecd.blocoI.n1.n2.n3.RegI200;
import efd.ecd.blocoI.n1.n2.n3.RegI300;
import efd.ecd.blocoI.n1.n2.n3.RegI350;
import efd.ecd.blocoI.n1.n2.n3.RegI500;
import efd.ecd.blocoI.n1.n2.n3.RegI510;
import efd.ecd.blocoI.n1.n2.n3.RegI550;
import lombok.Getter;
import lombok.Setter;

public class RegI010 {

	@Getter @Inclui
	private final String reg = "I010";
	
	@Getter @Setter @Inclui
	private String indEsc;
	
	@Getter @Setter @Inclui
	private String codVerLc;
	
	@Getter @Setter @Filho
	private List<RegI012> regI012;
	
	@Getter @Setter @Filho
	private List<RegI020> regI020;
	
	@Getter @Setter @Filho
	private RegI030 regI030;
	
	@Getter @Setter @Filho
	private List<RegI050> regI050;
	
	@Getter @Setter @Filho
	private List<RegI075> regI075;
	
	@Getter @Setter @Filho
	private List<RegI100> regI100;
	
	@Getter @Setter @Filho
	private List<RegI150> regI150;
	
	@Getter @Setter @Filho
	private List<RegI200> regI200;
	
	@Getter @Setter @Filho
	private List<RegI300> regI300;
	
	@Getter @Setter @Filho
	private List<RegI350> regI350;
	
	@Getter @Setter @Filho
	private List<RegI500> regI500;
	
	@Getter @Setter @Filho
	private List<RegI510> regI510;
	
	@Getter @Setter @Filho
	private List<RegI550> regI550;
	
	public RegI010(String indEsc, String codVerLc) {
		super();
		this.indEsc = indEsc;
		this.codVerLc = codVerLc;
	}
	
	public RegI010() {/* */}
}
