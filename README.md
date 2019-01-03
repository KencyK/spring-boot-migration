# spring-boot-migration
To share the issues faced during migration from spring boot 2.0.0 to 2.1.1

While running the test in IntelliJ, the below error is encountered

>org.springframework.data.mapping.context.InvalidPersistentPropertyPath: No property 'IA1Value' found on class com.experiments.migration.mongo.Report! Did you mean: IA2Value,IA1Value,iA2Value,iA1Value?

If the @Version is removed everything works fine.

NOTE : Another way to fix is by keeping the field name and the variable name the same. But my actual project has lots of fields(more than 20) which is used across the application. Thus, changing the variable name would mean fixing a lot of compilation issues. So would like to keep the field name change as the last resort.
