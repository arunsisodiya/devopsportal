package com.accenture.devops.controllers;

import com.accenture.devops.beans.Tools;
import com.accenture.devops.repository.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.tools.Tool;
import java.util.Collection;
import java.util.List;

/**
 * Created by arun.singh.sisodiya on 2/21/2017.
 */
@RestController
@RequestMapping("/")
public class ToolManager {

  @Autowired
  private ToolsRepository repository;

  @RequestMapping(value = "/",method = RequestMethod.GET)
  public ResponseEntity<List<Tools>> getAllTools()
  {
      return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
  }
  @RequestMapping(value = "/get",method = RequestMethod.GET)
  public ResponseEntity<List<Tools>> getToolsList(@RequestParam(value = "category",defaultValue = "build")String category)
  {
      return new ResponseEntity<>(repository.findToolsListByCategory(category),HttpStatus.OK);
  }
  @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<?> addToolsList(@RequestBody Tools toolsList)
  {
      return new ResponseEntity<>(repository.save(toolsList), HttpStatus.OK);
  }
  @RequestMapping(value = "/id/{id}",method = RequestMethod.GET)
  public ResponseEntity<Tools> getToolListByID(@PathVariable Long id)
  {
    return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
  }


}
