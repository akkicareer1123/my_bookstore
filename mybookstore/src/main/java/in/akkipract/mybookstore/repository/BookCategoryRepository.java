package in.akkipract.mybookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.akkipract.mybookstore.entity.BookCategory;

//@RepositoryRestResource(collectionResourceRel="bookCategory", path="book_Category")
public interface BookCategoryRepository  extends JpaRepository<BookCategory, Long>{

}
