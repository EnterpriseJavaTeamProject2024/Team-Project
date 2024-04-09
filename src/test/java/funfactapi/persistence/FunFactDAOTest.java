package funfactapi.persistence;

import funfactapi.entities.FunFacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FunFactDAOTest {
    FunFactDAO dao;

    @BeforeEach
    public void setup() {
        dao = new FunFactDAO();
    }

    @Test
    void getRandomFunFactSuccess() {
        FunFacts funFact = dao.getRandomFunFact();
        assertNotNull(funFact);
    }
}
