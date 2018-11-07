package com.codeclan.example.opensaucebackend.repository.ingredients;

import com.codeclan.example.opensaucebackend.models.Cocktail;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class IngredientRepositoryImpl implements IngredientRepositoryCustom {


    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Cocktail> allCocktailsContainingIngredientWithId(Long id) {
        List<Cocktail> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Cocktail.class);
            cr.createAlias("measures", "measure");
            cr.createAlias("measure.ingredient", "ingredient");
            cr.add(Restrictions.eq("ingredient.id", id));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
