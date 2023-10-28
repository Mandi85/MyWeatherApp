package org.example.dao;

import org.example.model.WeatherData;

import javax.xml.stream.Location;
import java.util.List;
import java.util.UUID;

public interface WeatherDataDao {
    public WeatherData findById(UUID id);
    public List<WeatherData> findByLocation(Location location);
    public void save(WeatherData weatherData);
    public void update(WeatherData weatherData);
    public  void delete(WeatherData weatherData);
}
