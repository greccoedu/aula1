
package aula01;

public class Carro {
    public String Marca;
    public String Modelo;
    public String Cor;
    public int Ano;
    public int AnoFabricacao;
    public boolean Andando;
    
    public void Andar(){
        this.Andando = true;
    }
    
    public void Frear(){
        this.Andando = false;
    }
    
    public void AcaoCarro (boolean andar, String marca){
        if (andar){
            System.out.println(marca + ", está Andando");
        } else {
            System.out.println(marca + ", está Parado");
        }
    }
    
}
