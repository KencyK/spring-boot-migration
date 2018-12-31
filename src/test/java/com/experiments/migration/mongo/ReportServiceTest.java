package com.experiments.migration.mongo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceTest {

    @Inject
    ReportService reportService;

    @Inject
    ReportRepository reportRepository;

    @Test
    public void testUpdateReport() {
        reportService.addAmountReport("TEST");
        reportService.updateAmountReport("TEST");
        Optional<Report> test = reportService.getReport("TEST");
        Assert.assertTrue(test.isPresent());
    }
}
