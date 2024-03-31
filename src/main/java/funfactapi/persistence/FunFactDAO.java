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
}
