package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos", schema = "java_jpa_udemy")
public class Produto {
	
	@Id
	private Integer id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preço;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	

}
