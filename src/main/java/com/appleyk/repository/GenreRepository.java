package com.appleyk.repository;

import com.appleyk.node.Genre;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends Neo4jRepository<Genre, Long>{
	
	 List<Genre> findByName(@Param("name") String name); 
}
