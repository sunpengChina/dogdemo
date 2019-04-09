package top.dogtcc.test.server3.dao;

import top.dogtcc.database.core.annotation.DogDb;
import top.dogtcc.database.core.annotation.QueryArg;
import top.dogtcc.database.spring.mongo.DogMongoRepository;
//import org.springframework.data.repository.CrudRepository;

public interface ReturnMongoRepository extends DogMongoRepository<ReturnOrder, String> {


     ReturnOrder findByIdAndOther(String id, String other) ;

     @DogDb(repositoryClass = ReturnMongoRepository.class, queryMethodName = "findByIdAndOther",
             saveMethodName = "save")
     void deleteByIdAndOther(@QueryArg(argName = "ID") String id, @QueryArg(argName = "Other")String other);


}
