package bot.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

// Ни в коем случае не пиши "import jakarta.persistence.*", новые версии Hibernate его просто не видят

@Entity(name="Example")
@Table(name="examples")
public class Example {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="example_names")
    private String exampleNames;

    /* @Column(name="...")
    * ...
    *
    * И так далее
    */

    public Example() {
    }

    public Example(String exampleNames) {
        this.exampleNames = exampleNames;
    }

    //И так же нужные геттеры и сеттеры
}
