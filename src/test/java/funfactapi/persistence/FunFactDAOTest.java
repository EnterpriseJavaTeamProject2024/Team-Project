package funfactapi.persistence;

import funfactapi.entities.FunFacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import util.Database;

public class FunFactDAOTest {
    FunFactDAO dao;

    @BeforeEach
    public void setup() {
        dao = new FunFactDAO();
        Database database = Database.getInstance();
        database.runSQL("CreateFunFacts.sql");
    }

    @Test
    void getRandomFunFactSuccess() {
        FunFacts funFact = dao.getRandomFunFact();
        assertNotNull(funFact);
    }

    @Test
    void getFunFactByIdSuccess() {
        FunFacts funFact = dao.getRandomFunFactByID(1);
        assertNotNull(funFact);
        assertEquals(1, funFact.getID());
    }

    @Test
    void getFunFactByCategorySuccess() {
        FunFacts funFact = dao.getRandomFunFactByCategory("Food");
        assertNotNull(funFact);
        assertEquals("Food", funFact.getCategory());
    }

    @Test
    void updateFunFactSuccess() {
        FunFacts funFact = dao.updateFunFact(1, "TESTING", "TEST");
        assertNotNull(funFact);
        funFact = dao.getRandomFunFactByID(1);
        assertNotNull(funFact);
        assertEquals("TEST", funFact.getCategory());
        assertEquals("TESTING", funFact.getFunFact());
    }

    @Test
    void deleteFunFactSuccess() {
        boolean deleted = dao.deleteFunFact(1);
        assertEquals(deleted, true);
        assertNull(dao.getRandomFunFactByID(1));
    }

    @Test
    void createFunFactSuccess() {
        FunFacts newFunFact = dao.createFunFact("TESTING", "TEST");
        assertNotNull(newFunFact);
        assertEquals(51, newFunFact.getID());
    }

}
