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
import javax.persistence.Table;

@Entity
public class LegoSets {
	
	@Id
	private String set_name;
	private String set_year;
	private long piece_count;
	private String set_theme; 

	public LegoSets() {
		
	}

	public LegoSets(String name) {
		super();
		this.set_name = name;
	}

	public LegoSets(String name, String year) {
		super();
		this.set_name = name;
		this.set_year = year;
	}

	public LegoSets(String name, String year, long piece_count) {
		super();
		this.set_name = name;
		this.set_year = year;
		this.piece_count = piece_count;
	}

	public LegoSets(String name, String year, String theme) {
		super();
		this.set_name = name;
		this.set_year = year;
		this.set_theme = theme;
	}

	public LegoSets(String name, String year, long piece_count, String theme) {
		super();
		this.set_name = name;
		this.set_year = year;
		this.piece_count = piece_count;
		this.set_theme = theme;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return set_name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.set_name = name;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return set_year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.set_year = year;
	}

	/**
	 * @return the piece_count
	 */
	public long getPiece_count() {
		return piece_count;
	}

	/**
	 * @param piece_count the piece_count to set
	 */
	public void setPiece_count(long piece_count) {
		this.piece_count = piece_count;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return set_theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.set_theme = theme;
	}

	@Override
	public String toString() {
		return "Sets [name=" + set_name + ", year=" + set_year + ", piece_count=" + piece_count + ", theme=" + set_theme + "]";
	}

}
