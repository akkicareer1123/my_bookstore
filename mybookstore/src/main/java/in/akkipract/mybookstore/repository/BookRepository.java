package in.akkipract.mybookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akkipract.mybookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
