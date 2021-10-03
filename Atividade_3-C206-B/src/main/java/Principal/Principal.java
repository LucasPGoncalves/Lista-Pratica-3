package Principal;

import Objetos.Endereco;
import Objetos.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Lucas", 345678, 2);
        Endereco endereco1 = new Endereco("Rua Um" , "Bairro Um" , 1);
        Endereco endereco2 = new Endereco("Rua Dois" , "Bairro Dois" , 2);

        pessoa.addEndereco(endereco1);
        pessoa.mostraInfo();

        pessoa.addEndereco(endereco2);
        pessoa.mostraInfo();

    }
}
