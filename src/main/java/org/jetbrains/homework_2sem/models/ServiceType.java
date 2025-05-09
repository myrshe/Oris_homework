package org.jetbrains.homework_2sem.models;

public enum ServiceType {
    OIL_CHANGE("Замена масла"),
    FILTERS_REPLACEMENT("Замена фильтров"),
    BRAKE_SERVICE("Обслуживание тормозной системы"),
    TIRE_REPLACEMENT("Замена шин"),
    WHEEL_ALIGNMENT("Развал-схождение"),
    BATTERY_REPLACEMENT("Замена аккумулятора"),
    ENGINE_DIAGNOSTICS("Диагностика двигателя"),
    TRANSMISSION_SERVICE("Обслуживание трансмиссии"),
    SUSPENSION_REPAIR("Ремонт подвески"),
    AIR_CONDITIONING_SERVICE("Обслуживание кондиционера"),
    ELECTRICAL_SYSTEM_CHECK("Проверка электросистемы"),
    BODY_REPAIR("Кузовной ремонт"),
    PAINT_JOB("Покраска"),
    INTERIOR_CLEANING("Химчистка салона"),
    MAINTENANCE_INSPECTION("Плановое ТО"),
    SOFTWARE_UPDATE("Обновление ПО"),
    EXHAUST_SYSTEM_REPAIR("Ремонт выхлопной системы"),
    FUEL_SYSTEM_CLEANING("Чистка топливной системы"),
    COOLANT_REPLACEMENT("Замена охлаждающей жидкости"),
    BELTS_REPLACEMENT("Замена ремней");
    private final String displayName;

    ServiceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
