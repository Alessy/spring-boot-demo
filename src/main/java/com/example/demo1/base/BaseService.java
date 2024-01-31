package com.example.demo1.base;

import java.util.List;

import jakarta.transaction.Transactional;

public abstract class BaseService<E, ID> {

  private BaseRepository<E, ID> repository;

  public BaseService(BaseRepository<E, ID> repository){
    this.repository = repository;

  }

  public List<E> getAll(){
    return repository.findAll();
  }

  @Transactional
  public E create(E entity) {
    return repository.save(entity);
  }

  @Transactional
  public void delete(ID id){
    repository.deleteById(id);
  }

  @Transactional
  public E update(ID id, E entity) {
    E emp = repository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found with id: " + id));
    emp = entity;

    return repository.save(emp);    
  }
  
}
