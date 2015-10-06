package br.com.fiap.starcrap.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Duration;

/**
 * Created by felipeweb on 10/6/15.
 */
@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, String> {

	@Override
	public String convertToDatabaseColumn(Duration value) {
		return value == null ? null : value.toString();
	}

	@Override
	public Duration convertToEntityAttribute(String value) {
		return value == null ? null : Duration.parse(value);
	}
}
