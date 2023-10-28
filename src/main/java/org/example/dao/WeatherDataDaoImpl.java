package org.example.dao;

import org.example.model.WeatherData;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.xml.stream.Location;
import java.util.List;
import java.util.UUID;

public class WeatherDataDaoImpl implements WeatherDataDao{
    public SessionFactory sessionFactory;

    public WeatherDataDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public WeatherData findById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(WeatherData.class,id);
    }
    @Override
    public List<WeatherData> findByLocation(Location location) {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<WeatherData> query = builder.createQuery(WeatherData.class);
            Root<WeatherData> root = query.from(WeatherData.class);
            query.select(root).where((builder.equal(root.get("location"),location)));
            Query<WeatherData> q = session.createQuery(query);
            return q.getResultList();
        }
    }
    @Override
    public void save(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.save(weatherData);
    }
    @Override
    public void update(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.update(weatherData);
    }
    @Override
    public void delete(WeatherData weatherData) {
        Session session= sessionFactory.getCurrentSession();
        session.delete(weatherData);
    }
}