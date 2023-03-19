package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC100 implements Serializable {
	private static final long serialVersionUID = -5952082811148273385L;

	@Inclui
    private final String reg = "C100";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private Long numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtES;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private String indPgto;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlAbatNt;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private String indFrt;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private BigDecimal vlSeg;

    @Inclui
    private BigDecimal vlOutDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private BigDecimal vlIpi;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal vlPisSt;

    @Inclui
    private BigDecimal vlCofinsSt;

    @Filho
    private RegC101 regC101;

    @Filho
    private RegC105 regC105;

    @Filho
    private List<RegC110> regC110;

    @Filho
    private List<RegC120> regC120;

    @Filho
    private RegC130 regC130;

    @Filho
    private RegC140 regC140;

    @Filho
    private RegC160 regC160;

    @Filho
    private List<RegC165> regC165;

    @Filho
    private List<RegC170> regC170;

    @Filho
    private List<RegC185> regC185;

    @Filho
    private List<RegC190> regC190;

    @Filho
    private List<RegC195> regC195;

    // Campo para utilidades, não entra no registro
    private Object c_0;

    // Campo para utilidades, não entra no registro
    private Object c_1;
    
    // Campo para utilidades, não entra no registro
    private Object c_2;
    
    // Campo para utilidades, não entra no registro
    private Object c_3;
    
    // Campo para utilidades, não entra no registro
    private Object c_4;
    
    // Campo para utilidades, não entra no registro
    private Object c_5;
    
    // Campo para utilidades, não entra no registro
    private Object c_6;
    
    // Campo para utilidades, não entra no registro
    private Object c_7;
    
    // Campo para utilidades, não entra no registro
    private Object c_8;
    
    // Campo para utilidades, não entra no registro
    private Object c_9;

    public RegC100(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Long numDoc, String chvNfe, LocalDate dtDoc, LocalDate dtES, BigDecimal vlDoc, String indPgto, BigDecimal vlDesc, BigDecimal vlAbatNt, BigDecimal vlMerc, String indFrt, BigDecimal vlFrt, BigDecimal vlSeg, BigDecimal vlOutDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlIpi, BigDecimal vlPis, BigDecimal vlCofins, BigDecimal vlPisSt, BigDecimal vlCofinsSt) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.dtES = dtES;
        this.vlDoc = vlDoc;
        this.indPgto = indPgto;
        this.vlDesc = vlDesc;
        this.vlAbatNt = vlAbatNt;
        this.vlMerc = vlMerc;
        this.indFrt = indFrt;
        this.vlFrt = vlFrt;
        this.vlSeg = vlSeg;
        this.vlOutDa = vlOutDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.vlIpi = vlIpi;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.vlPisSt = vlPisSt;
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC100(){}

    public String getReg() {
        return reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Integer getCodSit() {
        return codSit;
    }

    public void setCodSit(Integer codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public LocalDate getDtES() {
        return dtES;
    }

    public void setDtES(LocalDate dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public String getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public String getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public RegC101 getRegC101() {
        return regC101;
    }

    public void setRegC101(RegC101 regC101) {
        this.regC101 = regC101;
    }

    public RegC105 getRegC105() {
        return regC105;
    }

    public void setRegC105(RegC105 regC105) {
        this.regC105 = regC105;
    }

    public List<RegC110> getRegC110() {
        return regC110;
    }

    public void setRegC110(List<RegC110> regC110) {
        this.regC110 = regC110;
    }

    public List<RegC120> getRegC120() {
        return regC120;
    }

    public void setRegC120(List<RegC120> regC120) {
        this.regC120 = regC120;
    }

    public RegC130 getRegC130() {
        return regC130;
    }

    public void setRegC130(RegC130 regC130) {
        this.regC130 = regC130;
    }

    public RegC140 getRegC140() {
        return regC140;
    }

    public void setRegC140(RegC140 regC140) {
        this.regC140 = regC140;
    }

    public RegC160 getRegC160() {
        return regC160;
    }

    public void setRegC160(RegC160 regC160) {
        this.regC160 = regC160;
    }

    public List<RegC165> getRegC165() {
        return regC165;
    }

    public void setRegC165(List<RegC165> regC165) {
        this.regC165 = regC165;
    }

    public List<RegC170> getRegC170() {
        return regC170;
    }

    public void setRegC170(List<RegC170> regC170) {
        this.regC170 = regC170;
    }

    public List<RegC185> getRegC185() {
        return regC185;
    }

    public void setRegC185(List<RegC185> regC185) {
        this.regC185 = regC185;
    }

    public List<RegC190> getRegC190() {
        return regC190;
    }

    public void setRegC190(List<RegC190> regC190) {
        this.regC190 = regC190;
    }

    public List<RegC195> getRegC195() {
        return regC195;
    }

    public void setRegC195(List<RegC195> regC195) {
        this.regC195 = regC195;
    }

    public Object getC_0() {
        return c_0;
    }

    public void setC_0(Object c_0) {
        this.c_0 = c_0;
    }

    public Object getC_1() {
        return c_1;
    }

    public void setC_1(Object c_1) {
        this.c_1 = c_1;
    }

    public Object getC_2() {
        return c_2;
    }

    public void setC_2(Object c_2) {
        this.c_2 = c_2;
    }

    public Object getC_3() {
        return c_3;
    }

    public void setC_3(Object c_3) {
        this.c_3 = c_3;
    }

    public Object getC_4() {
        return c_4;
    }

    public void setC_4(Object c_4) {
        this.c_4 = c_4;
    }

    public Object getC_5() {
        return c_5;
    }

    public void setC_5(Object c_5) {
        this.c_5 = c_5;
    }

    public Object getC_6() {
        return c_6;
    }

    public void setC_6(Object c_6) {
        this.c_6 = c_6;
    }

    public Object getC_7() {
        return c_7;
    }

    public void setC_7(Object c_7) {
        this.c_7 = c_7;
    }

    public Object getC_8() {
        return c_8;
    }

    public void setC_8(Object c_8) {
        this.c_8 = c_8;
    }

    public Object getC_9() {
        return c_9;
    }

    public void setC_9(Object c_9) {
        this.c_9 = c_9;
    }
    
}
