package funfactapi.persistence;

import funfactapi.entities.Admin;

public class AdminDAO {
    private GenericDao<Admin> dao;

    public AdminDAO() {
        dao = new GenericDao<>(Admin.class);
    }

    public boolean validAdminKey(String adminKey) {
        if (!dao.findByPropertyEqual("adminKey", adminKey).isEmpty()) {
            return true;
        }
        return false;
    }

}
