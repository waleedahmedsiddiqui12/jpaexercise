package com.was.jpaexercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBooksRepository  extends JpaRepository<Books,Long> {
    
}
