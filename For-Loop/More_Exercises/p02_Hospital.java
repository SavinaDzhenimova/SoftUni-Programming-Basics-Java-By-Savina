package More_Exercises;

import java.util.Scanner;

public class p02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= n; i++) {
            int patients = Integer.parseInt(scanner.nextLine());


            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
            }

            if (patients > doctors) {
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            } else {
                treatedPatients += patients;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);
    }
}
