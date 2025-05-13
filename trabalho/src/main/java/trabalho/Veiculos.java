/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabalho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Veiculos 
{
 private int id;
 private String nome_veiculo,placa,modelo,observações;
 //ele ja comeca com os valores preenchidos
 public static ArrayList<Tipos_Caminhao> tipos_caminhao= new ArrayList<>( List.of( Tipos_Caminhao.values() ) );
 private String tipo;
 private double capacidade_peso;
 //isso aqui contem os 3 atributos da classe Dimensoes,para acessarmos a altura por exemplo podemos usar Veiculos.getDimensoes().getAltura()
 private Dimensoes dimensoes;

 //construtor serve para instanciar a classe já com valores
 public Veiculos(int id, String nome_veiculo, String placa, String modelo, String observações,Dimensoes dimensoes, double capacidade_peso, String tipo)
 {
  this.id = id;
  this.nome_veiculo = nome_veiculo;
  this.placa = placa;
  this.modelo = modelo;
  this.observações = observações;
  this.dimensoes=dimensoes;
  this.capacidade_peso = capacidade_peso;
  this.tipo = tipo;
 }
 
//como os atributos sao privados,para acessarmos eles fora da classe que foram criados(essa) precisamos do get
 public int getId()
 {
  return id;
 }
// o set so serve para colocarmos um novo valor nessa variavel caso necessario(visto que os valores já sao inicializados no construtor)
 public void setId(int id)
 {
  this.id = id;
 }

 public String getNome_veiculo()
 {
  return nome_veiculo;
 }

 public void setNome_veiculo(String nome_veiculo)
 {
  this.nome_veiculo = nome_veiculo;
 }

 public String getPlaca()
 {
  return placa;
 }

 public void setPlaca(String placa)
 {
  this.placa = placa;
 }

 public String getModelo()
 {
  return modelo;
 }

 public void setModelo(String modelo)
 {
  this.modelo = modelo;
 }

 public String getObservações()
 {
  return observações;
 }

 public void setObservações(String observações)
 {
  this.observações = observações;
 }

 public ArrayList<Tipos_Caminhao> getTipos_caminhao()
 {
  return tipos_caminhao;
 }
 
public String getTipo() 
{
    return tipo;
}

 public Dimensoes getDimensoes()
 {
  return dimensoes;
 }

 public void setDimensoes(Dimensoes dimensoes)
 {
  this.dimensoes = dimensoes;
 }

 public double getCapacidade_peso()
 {
  return capacidade_peso;
 }

 public void setCapacidade_peso(double capacidade_peso)
 {
  this.capacidade_peso = capacidade_peso;
 }

}
