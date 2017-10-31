package com.darling.dao;

import com.darling.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ling on 17-10-29.
 */

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
