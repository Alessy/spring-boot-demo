package com.example.demo1.base;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel<ID> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private ID id;

  @CreatedBy
  protected String createdBy;

  @CreationTimestamp
  protected OffsetDateTime createdAt;

  @LastModifiedBy
  protected String updatedBy;

  @UpdateTimestamp
  protected OffsetDateTime updatedAt;
}
