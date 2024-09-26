package stmall.domain;

import stmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="oders", path="oders")
public interface OderRepository extends PagingAndSortingRepository<Oder, >{
}