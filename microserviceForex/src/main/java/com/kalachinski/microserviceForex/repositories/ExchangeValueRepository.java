package com.kalachinski.microserviceForex.repositories;

import com.kalachinski.microserviceForex.domains.ExchangeValue;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeValueRepository extends CrudRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
