package api.escalabilidade.forum;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "livro")
public class Livro implements Serializable {

    public static final String CACHE_NAME = "Livro";

    private static final long serialVersionUID = 5622816605342024631L;

    @Id
    private Long id;

    private String nome;

    private String autor;

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
