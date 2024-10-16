package com.lucianna.mendonca.lucianna_comp303_midterm.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    // SensorID – primary key, auto-incremented
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sensor_id")
    private Long sensorId;

    // SensorName – should not be blank (e.g. “Humidity Sensor”)
    @NotBlank(message = "Name cannot be blank")
    @Column(name = "sensor_name")
    private String sensorName;

    // SensorType – should not be blank and number (e.g. “Humidity”)
    @NotBlank(message = "Type cannot be blank")
    @Pattern(regexp = "^[^0-9]*$", message = "Type cannot contain numbers")
    @Column(name = "sensor_type")
    private String sensorType;

    // SensorPin – should not be null and a number between 0 and 1000 (e.g. 123)
    @NotNull(message = "Pin cannot be null")
    @Min(value = 0, message = "Value must be at least 0")
    @Max(value = 1000, message = "Value must be at most 1000")
    @Column(name = "sensor_pin")
    private Integer sensorPin;


    // SensorLocation – optional (e.g. “Office”)
    @Nullable
    @Column(name = "sensor_location")
    private String sensorLocation;

    // SensorStatus – should not be null and have value either ON or OFF
    @NotNull(message = "Status cannot be null")
    @Column(name = "sensor_status")
    private String sensorStatus;


    // Constructors
    public Sensor() {
    }

    public Sensor(Long sensorId, String sensorName, String sensorType, Integer sensorPin, @Nullable String sensorLocation, String sensorStatus) {
        this.sensorId = sensorId;
        this.sensorName = sensorName;
        this.sensorType = sensorType;
        this.sensorPin = sensorPin;
        this.sensorLocation = sensorLocation;
        this.sensorStatus = sensorStatus;
    }

    // Getters and Setters

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public @NotBlank(message = "Name cannot be blank") String getSensorName() {
        return sensorName;
    }

    public void setSensorName(@NotBlank(message = "Name cannot be blank") String sensorName) {
        this.sensorName = sensorName;
    }

    public @NotBlank(message = "Type cannot be blank") @Pattern(regexp = "^[^0-9]*$", message = "Type cannot contain numbers") String getSensorType() {
        return sensorType;
    }

    public void setSensorType(@NotBlank(message = "Type cannot be blank") @Pattern(regexp = "^[^0-9]*$", message = "Type cannot contain numbers") String sensorType) {
        this.sensorType = sensorType;
    }

    public @NotNull(message = "Pin cannot be null") @Min(value = 0, message = "Value must be at least 0") @Max(value = 1000, message = "Value must be at most 1000") Integer getSensorPin() {
        return sensorPin;
    }

    public void setSensorPin(@NotNull(message = "Pin cannot be null") @Min(value = 0, message = "Value must be at least 0") @Max(value = 1000, message = "Value must be at most 1000") Integer sensorPin) {
        this.sensorPin = sensorPin;
    }

    @Nullable
    public String getSensorLocation() {
        return sensorLocation;
    }

    public void setSensorLocation(@Nullable String sensorLocation) {
        this.sensorLocation = sensorLocation;
    }

    public @NotNull(message = "Status cannot be null") String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(@NotNull(message = "Status cannot be null") String sensorStatus) {
        this.sensorStatus = sensorStatus;
    }
}
