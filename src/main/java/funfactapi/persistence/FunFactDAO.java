package funfactapi.persistence;

import funfactapi.entities.FunFacts;

import java.util.List;
import java.util.Random;

public class FunFactDAO {

    private GenericDao<FunFacts> dao;
    private Random randomIndex;

    public FunFacts getRandomFunFactByCategory(String category) {
        dao = new GenericDao<>(FunFacts.class);
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
        dao = new GenericDao<>(FunFacts.class);
        randomIndex = new Random();
        List<FunFacts> results = dao.getAll();
        if (results.size() != 0) {
            int index = randomIndex.nextInt(results.size());
            return results.get(index);
        }
        return null;
    }

    public FunFacts getRandomFunFactByID(int ID) {
        dao = new GenericDao<>(FunFacts.class);
        try {
            FunFacts result = dao.getById(ID);
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
