    SET search_path TO weather;

    ALTER TABLE FORECAST
        RENAME COLUMN temperature to temperature_high;

    ALTER TABLE FORECAST
        RENAME COLUMN wind_power to wind_speed;

    ALTER TABLE FORECAST
        RENAME COLUMN perceived_temperature to apparent_temperature_high;

    ALTER TABLE FORECAST
        RENAME COLUMN atmospheric_pressure to pressure;

    ALTER TABLE FORECAST
        RENAME COLUMN air_humidity to humidity;

    ALTER TABLE FORECAST
        RENAME COLUMN precipType to precip_type;









