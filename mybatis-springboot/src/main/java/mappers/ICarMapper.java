package mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import models.Car;

@Mapper
public interface ICarMapper {
	
	@Insert("INSERT INTO CAR (name, model, rental_id) VALUES (#{name}, #{model}, #{rental_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void save(Car car);
	
	@Select("SELECT id, name, model, renatl_id FROM CAR WHERE id = #{id}")
	Car findById(long id);
	
	@Select("SELECT id, name, model, rental_id FROM CAR")
	Iterable<Car> findAll();
	
	

}
