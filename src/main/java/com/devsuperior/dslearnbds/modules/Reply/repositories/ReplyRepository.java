package com.devsuperior.dslearnbds.modules.Reply.repositories;

import com.devsuperior.dslearnbds.modules.Reply.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
