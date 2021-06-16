package mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import models.Rental;

@Mapper
public interface IRentalMapper {
	
	@Insert("INSERT INTO RENTAL (name, location) VALUES (#{name}, #{location})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void save(Rental rental);
	
	@Select("SELECT id, name, location FROM RENTAL WHERE id = #{id}")
	Rental findById(long id);
	
	@Select("SELECT id, name, location FROM RENTAL")
	Iterable<Rental> findAll();

}
