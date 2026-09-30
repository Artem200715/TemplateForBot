package bot.func;

import bot.db.Example;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    @PersistenceContext
    private EntityManager entityManager;

    // @Transactional
    // ...e33
}

