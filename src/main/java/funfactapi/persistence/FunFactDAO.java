package funfactapi.persistence;

import funfactapi.entities.Admin;
import funfactapi.entities.FunFacts;

import java.util.List;
import java.util.Random;

public class FunFactDAO {

    private GenericDao<FunFacts> dao;
    private GenericDao<Admin> adminDao;
    private Random randomIndex;

    public FunFactDAO() {
        dao = new GenericDao<>(FunFacts.class);
    }

    public FunFacts getRandomFunFactByCategory(String category) {
        randomIndex = new Random();
        try {
            List<FunFacts> results = dao.findByPropertyEqual("category", category);
            int index = randomIndex.nextInt(results.size());
            return results.get(index);
        } catch (Exception e) {
            return null;
        }
    }

    public FunFacts getRandomFunFact() {
        randomIndex = new Random();
        List<FunFacts> results = dao.getAll();
        if (results.size() != 0) {
            int index = randomIndex.nextInt(results.size());
            return results.get(index);
        }
        return null;
    }

    public FunFacts getRandomFunFactByID(int ID) {
        try {
            FunFacts result = dao.getById(ID);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    public FunFacts updateFunFact(int ID, String funFact, String category) {
        FunFacts fact = dao.getById(ID);
        if (funFact != null) {
            fact.setFunFact(funFact);
        }
        if (category != null) {
            fact.setCategory(category);
        }
        dao.update(fact);
        return fact;
    }
}
