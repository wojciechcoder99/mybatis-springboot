package app.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import app.models.Car;

@Mapper
public interface ICarMapper {
	
	@Insert("INSERT INTO CAR (name, model, rental_id) VALUES (#{name}, #{model}, #{rental_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void save(Car car);
	
	@Select("SELECT id, name, model, renatl_id FROM CAR WHERE id = #{id}")
	Car findById(long id);
	
	@Select("SELECT id, name, model, rental_id FROM CAR")
	Iterable<Car> findAll();
	
	@Delete("DELETE FROM CAR WHERE id = #{id}")
	void deleteById(long id);
	
	@Update("UPDATE CAR"
			+ "SET name = #{name}, model = #{model}, rental_id = #{rental_id}"
			+ "WHERE id = #{id}")
	Car updateById(long id, Car car);
	
	

}
