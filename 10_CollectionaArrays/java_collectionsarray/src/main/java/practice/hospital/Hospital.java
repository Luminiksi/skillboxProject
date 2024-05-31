package practice.hospital;

import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        int max = 40;
        int min = 32;
        Random r = new Random();
        float[] patientsTemp = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            float number = r.nextFloat((max - min)) + min;
            /*String strNumber = String.format("%.1f", number);
            strNumber = strNumber.replaceAll(",", ".");
            patientsTemp[i]= Float.parseFloat(strNumber);*/
            patientsTemp[i] = getShortFloat(number, 1);
//          А вот этот метод округляет так, что после запятой остается только 0ли
            /*patientsTemp[i]= Math.round(number);*/
        }
        return patientsTemp;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        float arithmeticSum = 0;
        int healthyCount = 0;
        String temperatures = "";
        for (int i = 0; i < temperatureData.length; i++) {
            temperatures += temperatureData[i];
            if (i < temperatureData.length - 1) {
                temperatures += " ";
            }
            arithmeticSum += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] < 37) {
                healthyCount++;
            }
        }
        float arithmetic = getShortFloat(arithmeticSum / temperatureData.length, 2);

        String report =
            "Температуры пациентов: " + temperatures +
            "\nСредняя температура: " + arithmetic +
            "\nКоличество здоровых: " + healthyCount;

        return report;
    }

    public static float getShortFloat(float number, int index) {
        String strNumber = String.format("%." + index + "f", number);
        strNumber = strNumber.replaceAll(",", ".");
        return Float.parseFloat(strNumber);
    }
}
