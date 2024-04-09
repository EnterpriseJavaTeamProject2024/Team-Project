package funfactapi.persistence;

import funfactapi.entities.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdminDAOTest {

    private AdminDAO dao;

    @BeforeEach
    public void setup() {
        dao = new AdminDAO();

    }

    @Test
    void getAdminKeySuccess() {
        boolean keyFound = dao.validAdminKey("testKey");
        assertEquals(true, keyFound);
    }

    @Test
    void getAdminKeyNotFound() {
        boolean keyFound = dao.validAdminKey("keyTest");
        assertNotEquals(true, keyFound);
    }

}
