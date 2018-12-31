package com.experiments.migration.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReportRepository extends MongoRepository<Report, String> {

    Optional<Report> findByReportName(String name);
}
