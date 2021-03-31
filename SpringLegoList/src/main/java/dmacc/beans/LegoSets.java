/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class LegoSets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//added in the id as it should probably be the unique value - not set name
	private String setName;
	private String setYear;
	private long pieceCount;
	private String setTheme; 

	public LegoSets(String name) {
		super();
		this.setName = name;
	}

	public LegoSets(String name, String year) {
		super();
		this.setName = name;
		this.setYear = year;
	}

	public LegoSets(String name, String year, long piece_count) {
		super();
		this.setName = name;
		this.setYear = year;
		this.pieceCount = piece_count;
	}

	public LegoSets(String name, String year, String theme) {
		super();
		this.setName = name;
		this.setYear = year;
		this.setTheme = theme;
	}

	public LegoSets(String name, String year, long piece_count, String theme) {
		super();
		this.setName = name;
		this.setYear = year;
		this.pieceCount = piece_count;
		this.setTheme = theme;
	}

	@Override
	public String toString() {
		return "Sets [name=" + setName + ", year=" + setYear + ", piece_count=" + pieceCount + ", theme=" + setTheme + "]";
	}

	//several setters were missing and the setters were not correct for the setName variable. 
	//I opted to remove them and let Lombok generate them so they are automatically there.

}
