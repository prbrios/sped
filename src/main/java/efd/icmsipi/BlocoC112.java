package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC112 {

    private final String reg = "C112";
    private CodDa codDa;
    private UF uf;
    private String numDa;
    private String codAut;
    private BigDecimal vlDa;
    private LocalDate dtVcto;
    private LocalDate dtPgto;

    public String getReg() {
        return reg;
    }

    public CodDa getCodDa() {
        return codDa;
    }

    public void setCodDa(CodDa codDa) {
        this.codDa = codDa;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public LocalDate getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(LocalDate dtPgto) {
        this.dtPgto = dtPgto;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codDa != null ? this.codDa.getCodigo() : null);
        arr.add(this.uf != null ? this.uf.getSigla() : null);
        arr.add(this.numDa);
        arr.add(this.codAut);
        arr.add(this.vlDa != null ? Parsers.formataNumero(this.vlDa, 2) : null);
        arr.add(this.dtVcto != null ? Parsers.formataData(this.dtVcto, "ddMMyyyy") : null);
        arr.add(this.dtPgto != null ? Parsers.formataData(this.dtPgto, "ddMMyyyy") : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum CodDa {

        DOCUMENTO_ESTADUAL_DE_ARRECADACAO("0"),
        GNRE("1");

        private String codigo;

        CodDa(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}
