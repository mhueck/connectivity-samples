/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.mhu.solar.battery;

import java.io.Serializable;
import java.time.Duration;
import java.util.HashMap;
import java.util.UUID;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class BatteryGattAttributes {
    private static HashMap<UUID, String> attributes = new HashMap();
    public static UUID BLE_CHAR_BATTERY = UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb");
    public static UUID BLE_SERVICE_BATTERY = UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb");

    static {
        // Sample Services.
        attributes.put(BLE_SERVICE_BATTERY, "Battery Service");
        attributes.put(BLE_CHAR_BATTERY, "Battery");
        attributes.put(UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb"), "Device Information Service");
        attributes.put(UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb"), "Manufacturer Name String");
    }

    public static String lookup(UUID uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }

    public static class BatteryDataPoint implements Serializable {
        private float inVoltage;
        private float inCurrent;
        private float outVoltage;
        private float outCurrent;
        private float batteryLevel;
        private float wattHIn;
        private float wattHOut;
        private Duration runtime;

        public Duration getRuntime() {
            return runtime;
        }

        public void setRuntime(Duration runtime) {
            this.runtime = runtime;
        }



        public float getInVoltage() {
            return inVoltage;
        }

        public void setInVoltage(float inVoltage) {
            this.inVoltage = inVoltage;
        }

        public float getInCurrent() {
            return inCurrent;
        }

        public void setInCurrent(float inCurrent) {
            this.inCurrent = inCurrent;
        }

        public float getOutVoltage() {
            return outVoltage;
        }

        public void setOutVoltage(float outVoltage) {
            this.outVoltage = outVoltage;
        }

        public float getOutCurrent() {
            return outCurrent;
        }

        public void setOutCurrent(float outCurrent) {
            this.outCurrent = outCurrent;
        }

        public float getBatteryLevel() {
            return batteryLevel;
        }

        public void setBatteryLevel(float batteryLevel) {
            this.batteryLevel = batteryLevel;
        }

        public float getWattHIn() {
            return wattHIn;
        }

        public void setWattHIn(float wattHIn) {
            this.wattHIn = wattHIn;
        }

        public float getWattHOut() {
            return wattHOut;
        }

        public void setWattHOut(float wattHOut) {
            this.wattHOut = wattHOut;
        }
    }
}
