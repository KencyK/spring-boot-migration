package com.experiments.migration.mongo;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;

@Service
public class ReportService {

    @Inject
    ReportRepository reportRepository;

    public void addAmountReport(String name) {
        Report amountReport = new Report(name);
        reportRepository.save(amountReport);
    }

    public Optional<Report> getReport(String name) {
        return reportRepository.findByReportName(name);
    }

    public void updateAmountReport(String name) {
        Optional<Report> byReportName = reportRepository.findByReportName(name);
        if (byReportName.isPresent()) {
            Report amountReport =  byReportName.get();
            reportRepository.save(amountReport);
        }
    }
}
