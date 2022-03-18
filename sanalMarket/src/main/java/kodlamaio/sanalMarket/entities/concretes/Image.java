package kodlamaio.sanalMarket.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "images_paths")
public class Image {
	
	@Id
	@Column(name="image_id")
	private String imageId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="date_of_creation")
	private LocalDate dateOfCreation;
	
	@Column(name = "item_id")
	private int itemId;

}
