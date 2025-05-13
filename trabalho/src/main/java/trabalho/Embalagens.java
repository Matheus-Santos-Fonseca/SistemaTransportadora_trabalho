package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Embalagens
{
    private Produtos produtos_associados;
    //isso aqui é pra ela comecar com os valores
    public static ArrayList<Tipos_Embalagem> tipos_embalagens=new ArrayList<>( List.of( Tipos_Embalagem.values() ) );
    private Dimensoes dimensoes;
    private double peso;
    private boolean empilhavel;
    private String observacoes;

    public Embalagens(Produtos produtos_associados, Dimensoes dimensoes, double peso, boolean empilhavel, String observacoes)
    {
        this.produtos_associados = produtos_associados;
        this.dimensoes = dimensoes;
        this.peso = peso;
        this.empilhavel = empilhavel;
        this.observacoes = observacoes;
    }

    public Produtos getProdutos_associados()
    {
        return produtos_associados;
    }

    public void setProdutos_associados(Produtos produtos_associados)
    {
        this.produtos_associados = produtos_associados;
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

    public boolean isEmpilhavel()
    {
        return empilhavel;
    }

    public void setEmpilhavel(boolean empilhavel)
    {
        this.empilhavel = empilhavel;
    }

    public String getObservacoes()
    {
        return observacoes;
    }

    public void setObservacoes(String observacoes)
    {
        this.observacoes = observacoes;
    }
}
