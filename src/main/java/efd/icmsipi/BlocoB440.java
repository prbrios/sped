package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB440 {

    private final String reg = "B440";
    private IndOper indOper;
    private String codPart;
    private BigDecimal vlContRt;
    private BigDecimal vlBcIssRt;
    private BigDecimal vlIssRt;

    public String getReg() {
        return reg;
    }

    public IndOper getIndOper() {
        return indOper;
    }

    public void setIndOper(IndOper indOper) {
        this.indOper = indOper;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public BigDecimal getVlContRt() {
        return vlContRt;
    }

    public void setVlContRt(BigDecimal vlContRt) {
        this.vlContRt = vlContRt;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indOper != null ? this.indOper.getCodigo() : null );
        arr.add(this.codPart);
        arr.add(this.vlContRt != null ? Parsers.formataNumero(this.vlContRt, 2) : null);
        arr.add(this.vlBcIssRt != null ? Parsers.formataNumero(this.vlBcIssRt, 2) : null);
        arr.add(this.vlIssRt != null ? Parsers.formataNumero(this.vlIssRt, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndOper {

        AQUISICAO("0"),
        PRESTACAO("1");

        private String codigo;

        IndOper(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return codigo;
        }
    }
}
