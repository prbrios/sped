package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bloco0200 {

    private final String reg = "0200";
    private String codItem;
    private String descrItem;
    private String codBarras;
    private String codAntItem;
    private String unidInv;
    private TipoItem tipoItem;
    private String codNcm;
    private String exIpi;
    private String codGen;
    private String codLst;
    private BigDecimal aliqIcms;
    private String cest;

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getCodGen() {
        return codGen;
    }

    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }

    public String getCodLst() {
        return codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codItem);
        arr.add(this.descrItem);
        arr.add(this.codBarras);
        arr.add(this.codAntItem);
        arr.add(this.unidInv);
        arr.add(this.tipoItem != null ? this.tipoItem.getCodigo() : null);
        arr.add(this.codNcm);
        arr.add(this.exIpi);
        arr.add(this.codGen);
        arr.add(this.codLst);
        arr.add(this.aliqIcms != null ? Parsers.formataNumero(this.aliqIcms, 2) : null);
        arr.add(this.cest);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum TipoItem {

        MERCADORIA_PARA_REVENDA("00"),
        MATERIA_PRIMA("01"),
        EMBALAGEM("02"),
        PRODUTO_EM_PROCESSO("03"),
        PRODUTO_ACABADO("04"),
        SUBPRODUTO("05"),
        PRODUTO_INTERMEDIARIO("06"),
        MATERIAL_DE_USO_E_CONSUMO("07"),
        ATIVO_IMOBILIZADO("08"),
        SERVICOS("09"),
        OUTROS_INSUMOS("10"),
        OUTRAS("99");

        private String codigo;

        TipoItem(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}
