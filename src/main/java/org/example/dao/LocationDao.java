package org.example.dao;

import javax.xml.stream.Location;
import java.util.List;
import java.util.UUID;

public interface LocationDao {
    public Location findById(UUID id);
    public List<Location> findAll();
    public void save(Location location);
    public void update(Location location);
    public  void delete(Location location);
}
