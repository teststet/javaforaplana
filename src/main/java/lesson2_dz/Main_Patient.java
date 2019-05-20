package lesson2_dz;

public class Main_Patient {
    public static void main(String[] args) {
        //Создаенм масив объектов
        Patient[] med = new Patient[5];

        //Забиваем каждый объект рандомными данными
        for(int i = 0; i < med.length; i++){
            med[i] = new Patient();
        }
        //Выводим созданный массив объектов
        for(int i = 0; i < med.length; i++)
            med[i].print_patient();

        //Выводим список пациентов по диагнозу
        String[] d = {"Волчанка", "ОРВИ", "Перелом", "Ушиб"};
        System.out.println("========================================================");
        System.out.println("По диагнозу");
        System.out.println("========================================================");
        for(int j = 0; j < d.length; j++){
            System.out.println("Диагноз: " + d[j]);
            for(int i = 0; i < med.length; i++){
                med[i].print_podiagnozu(d[j]);
            }
        }

        //Выводим список пациентов согласно заданому интервалу
        System.out.println("========================================================");
        System.out.println("По медкарте в интервале чисел");
        System.out.println("========================================================");
        for(int i = 0; i < med.length; i++)
            med[i].print_pomedcard(2000,6000);
    }


}
