package efd;

public enum UF {

    ACRE("AC", 0),
    ALAGOAS("AL", 0),
    AMAPA("AP", 0),
    AMAZONAS("AM", 0),
    BAHIA("BA", 0),
    CEARA("CE", 23),
    DISTRITO_FEDERAL("DF", 0),
    ESPIRITO_SANTO("ES", 0),
    GOIAS("GO",0),
    MARANHAO("MA",0),
    MATO_GROSSO("MT", 0),
    MATO_GROSSO_DO_SUL("MS", 0),
    MINAS_GERAIS("MG", 0),
    PARA("PA", 0),
    PARAIBA("PB",0),
    PARANA("PR",0),
    PERNAMBUCO("PE", 0),
    PIAUI("PI",0),
    RIO_DE_JANEIRO("RJ",0),
    RIO_GRANDE_DO_NORTE("RN",0),
    RIO_GRANDE_DO_SUL("RS",0),
    RONDONIA("RO", 0),
    RORAIMA("RR", 0),
    SANTA_CATARINA("SC", 0),
    SAO_PAULO("SP", 0),
    SERGIPE("SE", 0),
    TOCANTINS("TO", 0);

    private String sigla;
    private Integer codigo;

    UF(String sigla, Integer codigo){
        this.sigla = sigla;
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
