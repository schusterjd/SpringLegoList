/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LegoSets {
	
	@Id
	private String setName;
	private String setYear;
	private long pieceCount;
	private String setTheme; 

	public LegoSets() {
		
	}

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

	/**
	 * @return the name
	 */
	public String getName() {
		return setName;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.setName = name;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return setYear;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.setYear = year;
	}

	/**
	 * @return the piece_count
	 */
	public long getPiece_count() {
		return pieceCount;
	}

	/**
	 * @param piece_count the piece_count to set
	 */
	public void setPiece_count(long piece_count) {
		this.pieceCount = piece_count;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return setTheme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.setTheme = theme;
	}

	@Override
	public String toString() {
		return "Sets [name=" + setName + ", year=" + setYear + ", piece_count=" + pieceCount + ", theme=" + setTheme + "]";
	}

}
