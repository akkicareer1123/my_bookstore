package in.akkipract.mybookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
@Table(name="tbl_category")

public class BookCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="category")
	private Set<Book> book;
	
	
	

}
