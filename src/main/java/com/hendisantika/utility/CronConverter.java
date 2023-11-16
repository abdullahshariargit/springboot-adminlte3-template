package com.hendisantika.utility;

import com.hendisantika.entity.CronJobExpression;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class CronConverter implements AttributeConverter<CronJobExpression, String> {


    @Override
    public String convertToDatabaseColumn(CronJobExpression cronJobExpression) {
        if (cronJobExpression == null) {
            return null;
        }
        return cronJobExpression.getExpression();
    }

    @Override
    public CronJobExpression convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        return Stream.of(CronJobExpression.values())
                .filter(c -> c.getExpression().equals(s))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
