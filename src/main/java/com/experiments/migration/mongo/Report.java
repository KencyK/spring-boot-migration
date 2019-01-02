package com.experiments.migration.mongo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document
@Data
@NoArgsConstructor
public class Report  implements Serializable {
    @Id
    protected String id;

    @NotNull
    @Field("ReportName")
    protected String reportName;

    @Field("IA1Value")
    private Long iA1Value = 0L;

    @Field("IA2Value")
    private Long iA2Value = 0L;

    @Version
    private Long version;

    public Report(String reportName) {
        this.reportName = reportName;
    }

}