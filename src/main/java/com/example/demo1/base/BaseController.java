package com.example.demo1.base;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public abstract class BaseController<E extends BaseModel<ID>, ID> {

  private BaseService<E,ID> service;

  public BaseController(BaseService<E,ID> service){
    this.service = service;

  }

  @GetMapping()
  public List<E> getAll() {
      return service.getAll();
  }

  @PostMapping()
  public E create(@RequestBody E address) {
      return service.create(address);
  }

  @PutMapping("/{id}")
  public E putMethodName(@PathVariable ID id, @RequestBody E address) {
      return service.update(id, address);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable ID id){
    service.delete(id);
  }
  
}
