package app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.mappers.IRentalMapper;
import app.models.Rental;

@RestController
@RequestMapping("api/rentals")
public class RentalController {
	
	private IRentalMapper rentalMapper;
	
	public RentalController(IRentalMapper rentalMapper) {
		this.rentalMapper = rentalMapper;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rental> getRental(@PathVariable long id) {
		Rental Rental = rentalMapper.findById(id);
		if (Rental != null) {
			return new ResponseEntity<Rental>(Rental, HttpStatus.OK);
		}
		else return new ResponseEntity<Rental>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Rental>> getRentals(){
		return new ResponseEntity<Iterable<Rental>>(rentalMapper.findAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Rental> createRental(@RequestBody Rental Rental) {
		if (Rental != null) {
			rentalMapper.save(Rental);
			return new ResponseEntity<Rental>(Rental, HttpStatus.CREATED);
		}
		else return new ResponseEntity<Rental>(HttpStatus.BAD_REQUEST);
	}

}
