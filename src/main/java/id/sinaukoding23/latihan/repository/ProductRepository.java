package id.sinaukoding23.latihan.repository;

import id.sinaukoding23.latihan.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
