package DZ6;

import java.util.*;

public class Task1 {
    public static HashMap<Integer, Object> map = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public static boolean outputLapTop;
    public static ArrayList<LapTop> listLapTop = new ArrayList<>();
    public static int count = 0;

    public static void main(String[] args) {
        /**Создаем объекты и добавляем их в список listLapTop*/
        LapTop lapTop1 = new LapTop(32, 500, "Windows", "Blue");
        LapTop lapTop2 = new LapTop(16, 1000, "Windows", "Black");
        LapTop lapTop3 = new LapTop(8, 500, "Linux", "Silver");
        LapTop lapTop4 = new LapTop(16, 1000, "Linux", "Gold");
        LapTop lapTop5 = new LapTop(64, 1500, "Windows", "Red");

        listLapTop.add(lapTop1);
        listLapTop.add(lapTop2);
        listLapTop.add(lapTop3);
        listLapTop.add(lapTop4);
        listLapTop.add(lapTop5);

        getFiltr();
        getFiltrValues();

        for (int i = 0; i < listLapTop.size(); i++) {
            // System.out.println("Work in Object " + listLapTop.get(i));
            outputLapTop = true;
            Iterator<Map.Entry<Integer, Object>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {

                /**Если любой из фильтров не совпал,прекращаем проверку объекта и смотрим другой*/
                if (outputLapTop) {
                    int key = iterator.next().getKey();
                    switch (key) {
                        case (1): {
                            if (listLapTop.get(i).getRam() == (int) map.get(key)) outputLapTop = true;
                            else outputLapTop = false;
                            break;
                        }
                        case (2): {
                            if (listLapTop.get(i).getHdd() == (int) map.get(key)) outputLapTop = true;
                            else outputLapTop = false;
                            break;

                        }
                        case (3): {
                            if (listLapTop.get(i).getOc().toLowerCase().equals(((String) map.get(key)).toLowerCase()))
                                outputLapTop = true;
                            else outputLapTop = false;
                            break;

                        }
                        case (4): {
                            if (listLapTop.get(i).getColor().toLowerCase().equals(((String) map.get(key)).toLowerCase()))
                                outputLapTop = true;
                            else outputLapTop = false;
                            break;

                        }

                    }


                } else break;
            }

            if (outputLapTop) {
                System.out.println(listLapTop.get(i));
                count++;
            }


        }
        if (count == 0) {
            System.out.println("Не удалось найти ноутбук по заданным критериям.Попробуйте еще раз");
        }


    }

    /**
     * Список необходимых критериев фильтрации
     */
    public static void getFiltr() {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Введи цифры необходимые для критериев фильтрации:");
        System.out.println("1 - RAM");
        System.out.println("2 - HDD");
        System.out.println("3 - OC");
        System.out.println("4 - Color");
        System.out.println("Выход через exit");

        while (true) {
            String str = sc.next();
            if (str.equals("exit")) {
                break;
            } else {
                try {
                    if (Integer.parseInt(str) < 5) map.put(Integer.parseInt(str), null);
                    else {
                        System.out.println("Некорректный фильтр, программа аварийно завершена");
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод, программа аварийно завершена");
                    System.exit(0);

                }

            }
        }

    }

    /**
     * Значения критериев фильтрации
     **/
    public static void getFiltrValues() {
        Iterator<Map.Entry<Integer, Object>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next().getKey();
            if (key == 1) {
                System.out.print("Введите значение для поиска RAM.Допустимые значения:");
                TreeSet<Integer> setRam = new TreeSet<>();
                for (int i = 0; i < listLapTop.size(); i++) {
                    setRam.add(listLapTop.get(i).getRam());
                }

                System.out.println(setRam);
                String str = sc.next();
                int ram = Integer.parseInt(str);
                map.put(key, ram);
            }
            if (key == 2) {
                System.out.print("Введите значение для поиска HDD.Допустимые значения:");
                TreeSet<Integer> setHdd = new TreeSet<>();
                for (int i = 0; i < listLapTop.size(); i++) {
                    setHdd.add(listLapTop.get(i).getHdd());
                }
                System.out.println(setHdd);
                String str = sc.next();
                int hdd = Integer.parseInt(str);
                map.put(key, hdd);
            }
            if (key == 3) {
                System.out.print("Введите значение для поиска ОС.Допустимые значения:");
                TreeSet<String> setOc = new TreeSet<>();
                for (int i = 0; i < listLapTop.size(); i++) {
                    setOc.add(listLapTop.get(i).getOc());
                }
                System.out.println(setOc);
                String str = sc.next();
                map.put(key, str);
            }
            if (key == 4) {
                System.out.print("Введите значение для поиска ОС.Допустимые значения:");
                TreeSet<String> setColor = new TreeSet<>();
                for (int i = 0; i < listLapTop.size(); i++) {
                    setColor.add(listLapTop.get(i).getColor());
                }
                System.out.println(setColor);
                String str = sc.next();
                map.put(key, str);
            }
        }
    }


}


