package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Produtos
{
    public int id;
    private String nome, descricao, família, tipo, lote,observações;
    Dimensoes dimensoes;
    private double peso;
    public static ArrayList<Grau_fragilidade> fragilidade= new ArrayList<>( List.of ( Grau_fragilidade.values() ) );

    public Produtos(int id, String nome, String descricao, String família, String tipo, String lote, String observações, Dimensoes dimensoes, double peso)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.família = família;
        this.tipo = tipo;
        this.lote = lote;
        this.observações = observações;
        this.dimensoes = dimensoes;
        this.peso = peso;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getFamília()
    {
        return família;
    }

    public void setFamília(String família)
    {
        this.família = família;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getLote()
    {
        return lote;
    }

    public void setLote(String lote)
    {
        this.lote = lote;
    }

    public String getObservações()
    {
        return observações;
    }

    public void setObservações(String observações)
    {
        this.observações = observações;
    }

    public Dimensoes getDimensoes()
    {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes)
    {
        this.dimensoes = dimensoes;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public ArrayList<Grau_fragilidade> getFragilidade()
    {
        return fragilidade;
    }

}
