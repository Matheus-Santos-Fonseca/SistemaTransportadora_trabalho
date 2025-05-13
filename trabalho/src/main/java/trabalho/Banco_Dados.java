package trabalho;


import java.util.ArrayList;

public class Banco_Dados
{
    private static ArrayList<Veiculos> veiculos=new ArrayList<>();
    private static ArrayList<Produtos> produtos=new ArrayList<>();
    private static ArrayList<Embalagens> embalagens=new ArrayList<>();

    public static boolean addVeiculos(Veiculos veiculo)
    {
        String nome = veiculo.getNome_veiculo().trim();
        if (nome.length() >= 2)
        {
            veiculos.add(veiculo);
            return true;
        }
    return false;

    }
    
    public static boolean addProdutos(Produtos produto)
    {
        String nome = produto.getNome().trim();
        if (nome.length() >= 2) {
            produtos.add(produto);
            return true;
        }
        return false;
    }

    public Produtos achar_produtos(int id)
    {
        for(Produtos produto:produtos)
        {
            if(produto.getId()==id)
            {
                return produto;
            }
        }
        return null;
    }

    public static boolean addEmbalagens(Embalagens embalagem)
    {
        String nome = embalagem.getProdutos_associados().getNome().trim();
        if (nome.length() >= 2) {
            embalagens.add(embalagem);
            return true;
        }
        return false;
    }

   

    public static ArrayList<Veiculos> getVeiculos()
    {
        return veiculos;
    }

    public static ArrayList<Produtos> getProdutos()
    {
        return produtos;
    }

    public static ArrayList<Embalagens> getEmbalagens()
    {
        return embalagens;
    }

}



