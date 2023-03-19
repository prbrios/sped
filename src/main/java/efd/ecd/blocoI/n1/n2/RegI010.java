package efd.ecd.blocoI.n1.n2;

import java.io.Serializable;
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

public class RegI010 implements Serializable {
	private static final long serialVersionUID = -405446405854150301L;

	@Inclui
	private final String reg = "I010";
	
	@Inclui
	private String indEsc;
	
	@Inclui
	private String codVerLc;
	
	@Filho
	private List<RegI012> regI012;
	
	@Filho
	private List<RegI020> regI020;
	
	@Filho
	private RegI030 regI030;
	
	@Filho
	private List<RegI050> regI050;
	
	@Filho
	private List<RegI075> regI075;
	
	@Filho
	private List<RegI100> regI100;
	
	@Filho
	private List<RegI150> regI150;
	
	@Filho
	private List<RegI200> regI200;
	
	@Filho
	private List<RegI300> regI300;
	
	@Filho
	private List<RegI350> regI350;
	
	@Filho
	private List<RegI500> regI500;
	
	@Filho
	private List<RegI510> regI510;
	
	@Filho
	private List<RegI550> regI550;
	
	public RegI010(String indEsc, String codVerLc) {
		super();
		this.indEsc = indEsc;
		this.codVerLc = codVerLc;
	}
	
	public RegI010() {/* */}

	public String getReg() {
		return reg;
	}

	public String getIndEsc() {
		return indEsc;
	}

	public void setIndEsc(String indEsc) {
		this.indEsc = indEsc;
	}

	public String getCodVerLc() {
		return codVerLc;
	}

	public void setCodVerLc(String codVerLc) {
		this.codVerLc = codVerLc;
	}

	public List<RegI012> getRegI012() {
		return regI012;
	}

	public void setRegI012(List<RegI012> regI012) {
		this.regI012 = regI012;
	}

	public List<RegI020> getRegI020() {
		return regI020;
	}

	public void setRegI020(List<RegI020> regI020) {
		this.regI020 = regI020;
	}

	public RegI030 getRegI030() {
		return regI030;
	}

	public void setRegI030(RegI030 regI030) {
		this.regI030 = regI030;
	}

	public List<RegI050> getRegI050() {
		return regI050;
	}

	public void setRegI050(List<RegI050> regI050) {
		this.regI050 = regI050;
	}

	public List<RegI075> getRegI075() {
		return regI075;
	}

	public void setRegI075(List<RegI075> regI075) {
		this.regI075 = regI075;
	}

	public List<RegI100> getRegI100() {
		return regI100;
	}

	public void setRegI100(List<RegI100> regI100) {
		this.regI100 = regI100;
	}

	public List<RegI150> getRegI150() {
		return regI150;
	}

	public void setRegI150(List<RegI150> regI150) {
		this.regI150 = regI150;
	}

	public List<RegI200> getRegI200() {
		return regI200;
	}

	public void setRegI200(List<RegI200> regI200) {
		this.regI200 = regI200;
	}

	public List<RegI300> getRegI300() {
		return regI300;
	}

	public void setRegI300(List<RegI300> regI300) {
		this.regI300 = regI300;
	}

	public List<RegI350> getRegI350() {
		return regI350;
	}

	public void setRegI350(List<RegI350> regI350) {
		this.regI350 = regI350;
	}

	public List<RegI500> getRegI500() {
		return regI500;
	}

	public void setRegI500(List<RegI500> regI500) {
		this.regI500 = regI500;
	}

	public List<RegI510> getRegI510() {
		return regI510;
	}

	public void setRegI510(List<RegI510> regI510) {
		this.regI510 = regI510;
	}

	public List<RegI550> getRegI550() {
		return regI550;
	}

	public void setRegI550(List<RegI550> regI550) {
		this.regI550 = regI550;
	}
	
}
