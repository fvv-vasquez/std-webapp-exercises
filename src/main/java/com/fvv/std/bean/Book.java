package com.fvv.std.bean;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Bean class for a Book object
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Double unitPrice;
	private LocalDate publicationDate;
	
	/**
	 * Class constructor
	 * 
	 * @param id
	 * @param title
	 * @param unitPrice
	 * @param modificationDate
	 */
	public Book(final Long id, final String title, final Double unitPrice, final LocalDate publicationDate) {
		this.id = id;
		this.title = title;
		this.unitPrice = unitPrice;
		this.publicationDate = publicationDate;
	}

	/**
	 * Class constructor
	 */
	public Book() {
	}

	/**
	 * Sets the id.
	 * 
	 * @param id of Long type.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id of Long type.
	 */
	public Long getId() {
		return this.id;
	}
	
	/**
	 * Sets the title.
	 * 
	 * @param title of String type.
	 */
	public void setTitle(final String title) {
		this.title = title;
	}
	
	/**
	 * Gets the title.
	 * 
	 * @return the title of String type.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Sets the unit price.
	 * 
	 * @param unitPrice of Double type.
	 */
	public void setUnitPrice(final Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * Gets the unit price.
	 * 
	 * @return the unitPrice of Double type.
	 */
	public Double getUnitPrice() {
		return this.unitPrice;
	}
	
	/**
	 * Sets the publication date.
	 * 
	 * @param PublicationDate of LocalDate type.
	 */
	public void setPublicationDate(final LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * Gets the publication date.
	 * 
	 * @return the PublicationDate of LocalDate type.
	 */
	public LocalDate getPublicationDate() {
		return this.publicationDate;
	}
}
