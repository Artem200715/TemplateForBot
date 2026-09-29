package bot.db;

import jakarta.persistence.*;

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
