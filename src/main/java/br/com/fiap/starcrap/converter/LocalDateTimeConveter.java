package br.com.fiap.starcrap.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by felipeweb on 10/6/15.
 */
@Converter(autoApply = true)
public class LocalDateTimeConveter implements AttributeConverter<LocalDateTime, Timestamp> {

	@Override
	public java.sql.Timestamp convertToDatabaseColumn(LocalDateTime value) {
		return value == null ? null : Timestamp.valueOf(value);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp value) {
		return value == null ? null : value.toLocalDateTime();
	}
}
