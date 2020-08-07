package com.techtalentsouth.WeatherApp1;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.techtalentsouth.WeatherApp1.ZipCode;
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
	List<ZipCode> findAll(); 
	ZipCode deleteById(long id); 
	ZipCode findById(long id);
}