package com.accenture.devops.repository;

import com.accenture.devops.beans.Tools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by arun.singh.sisodiya on 2/21/2017.
 */
@RepositoryRestResource
public interface ToolsRepository extends JpaRepository<Tools, Long> {

    List<Tools> findToolsListByCategory(String category);

}
