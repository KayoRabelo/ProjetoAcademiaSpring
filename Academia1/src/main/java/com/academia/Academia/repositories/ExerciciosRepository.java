package com.academia.Academia.repositories;

import com.academia.Academia.entities.Exercicios;
import com.academia.Academia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciciosRepository extends JpaRepository<Exercicios, Long> {
}
