package tema.classe;

public class Tema {
	private Long id;
	private String nome;
	private Double valorAlugel;
	private String corToalha;

	public Tema(long id, String nome, Double valorAlugel, String corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAlugel = valorAlugel;
		this.corToalha = corToalha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorAlugel() {
		return valorAlugel;
	}

	public void setValorAlugel(Double valorAlugel) {
		this.valorAlugel = valorAlugel;
	}

	public String getCorToalha() {
		return corToalha;
	}

	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}



}
