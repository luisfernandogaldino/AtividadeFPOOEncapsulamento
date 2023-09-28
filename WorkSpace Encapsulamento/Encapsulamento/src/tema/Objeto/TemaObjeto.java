package tema.Objeto;

import Endereco.classe.Endereco;
import cliente.classe.Cliente;
import itemTema.classe.ItemTema;
import tema.classe.Tema;

public class TemaObjeto {

	public static void main(String[] args) {
		Tema tema  = new Tema(5800,"Luis fernando",4.000,"Verde");
		ItemTema item = new ItemTema(58, "Heitor", "Faça a avaliação");
		Endereco endereco1 = new Endereco( 580,"85",856,"Perto do Shopping","São Bernanrdo","Campinas","13030440","Sp");
		Cliente cliente = new Cliente (85,"Adriano","(11) 92256-1344","10289161835","401796978");

		// Do tema//
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAlugel());
		System.out.println(tema.getCorToalha());

		// do ItemTema
		System.out.println(item.getId());
		System.out.println(item.getNome());
		System.out.println(item.getDescricao());

		// do Endereco//
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());

		// Do Cliente//
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
	}






}
