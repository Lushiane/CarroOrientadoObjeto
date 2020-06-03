public class Carro {

    private String cor;
    private int anoFabricacao;
    private int qtdPortas;
    private String combustivel;
    private String marca;
    private int assentos;

    // Metodo de acesso GET
    public String getCor() {
        return cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    public int getAnoFabricacao() { 
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int GetQtdPortas() { 
        return qtdPortas;
    }

    public void setQtdPortas (int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel (String combustivel) {
        this.combustivel = combustivel;
    }

    public String GetMarca () {
        return marca; 
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }

    public int getAssentos () {
        return assentos;
    }

    public void setAssentos (int assentos) {
        this.assentos = assentos;
       }
    }
        
 


    


