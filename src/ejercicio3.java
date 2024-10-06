import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba su nivel de condicion fisica principiante (p), intermedio(i), avanzado(a)");
        String nivel = lectura.nextLine().toLowerCase();

        switch (nivel) {
            case "p":
                System.out.println("** Rutina de 30 Minutos para Principiantes **\n");

                // Calentamiento (5 minutos)
                System.out.println("** Calentamiento (5 minutos):");
                System.out.println("1. Marcha en el lugar o caminar enérgicamente – 3 minutos.");
                System.out.println("   - Mantén un ritmo moderado, moviendo los brazos.");
                System.out.println("2. Movilidad Articular – 2 minutos.");
                System.out.println("   - Círculos con los brazos (10 hacia adelante, 10 hacia atrás).");
                System.out.println("   - Rotaciones suaves del cuello.");
                System.out.println("   - Círculos de cadera y rodillas.\n");

                // Cardio (10 minutos)
                System.out.println("** Cardio (10 minutos):");
                System.out.println("1. Marcha en el lugar o Caminar rápido – 5 minutos.");
                System.out.println("   - Aumenta gradualmente la velocidad para elevar tu ritmo cardíaco.");
                System.out.println("2. Jumping Jacks modificados – 1 minuto.");
                System.out.println("   - Hazlo lentamente, o sin saltar si es necesario.");
                System.out.println("3. Sentadillas básicas – 2 minutos.");
                System.out.println("   - Realiza sentadillas a tu ritmo.");
                System.out.println("4. Elevaciones de rodillas – 2 minutos.");
                System.out.println("   - Eleva las rodillas alternadamente al nivel de la cintura.\n");

                // Fuerza (10 minutos)
                System.out.println("** Ejercicios de Fuerza (10 minutos):");
                System.out.println("1. Flexiones modificadas (rodillas en el suelo) – 3 series de 10 repeticiones.");
                System.out.println("2. Plancha frontal – Mantén durante 20-30 segundos.");
                System.out.println("3. Puente de glúteos – 3 series de 12 repeticiones.");
                System.out.println("4. Peso muerto con el propio cuerpo (sin peso) – 2 series de 15 repeticiones.\n");

                // Enfriamiento y estiramientos (5 minutos)
                System.out.println("** Enfriamiento y Estiramientos (5 minutos):");
                System.out.println("1. Estiramiento de brazos y piernas – 2 minutos.");
                System.out.println("2. Estiramiento de espalda baja – 1 minuto.");
                System.out.println("3. Respiraciones profundas – 2 minutos.");
            case "i":
                System.out.println("** Rutina de 30 Minutos para Nivel Intermedio **\n");

                // Calentamiento (5 minutos)
                System.out.println("** Calentamiento (5 minutos):");
                System.out.println("1. Trote suave en el lugar o saltos pequeños – 3 minutos.");
                System.out.println("   - Incrementa el ritmo progresivamente.");
                System.out.println("2. Movilidad Articular – 2 minutos.");
                System.out.println("   - Círculos con los brazos (10 hacia adelante, 10 hacia atrás).");
                System.out.println("   - Rotaciones suaves del cuello y cintura.");
                System.out.println("   - Estiramiento dinámico de piernas.\n");

                // Cardio (10 minutos)
                System.out.println("** Cardio (10 minutos):");
                System.out.println("1. Jumping Jacks – 2 minutos.");
                System.out.println("   - Aumenta la intensidad con movimientos amplios.");
                System.out.println("2. Burpees (sin salto al final si es necesario) – 1 minuto.");
                System.out.println("   - Mantén un ritmo constante.");
                System.out.println("3. Sentadillas con salto – 2 minutos.");
                System.out.println("   - Aterriza suavemente al bajar.");
                System.out.println("4. Mountain Climbers – 2 minutos.");
                System.out.println("   - Mantén una posición de plancha fuerte.");
                System.out.println("5. Rodillas altas (High Knees) – 3 minutos.");
                System.out.println("   - Eleva las rodillas al nivel de la cintura o más alto.\n");

                // Fuerza (10 minutos)
                System.out.println("** Ejercicios de Fuerza (10 minutos):");
                System.out.println("1. Flexiones estándar – 3 series de 15 repeticiones.");
                System.out.println("2. Plancha frontal – Mantén durante 30-40 segundos.");
                System.out.println("3. Puente de glúteos con una pierna – 3 series de 10 repeticiones por pierna.");
                System.out.println("4. Estocadas alternas (Lunges) – 3 series de 12 repeticiones por pierna.\n");

                // Enfriamiento y estiramientos (5 minutos)
                System.out.println("** Enfriamiento y Estiramientos (5 minutos):");
                System.out.println("1. Estiramiento de isquiotibiales – 1 minuto.");
                System.out.println("2. Estiramiento de cuádriceps – 1 minuto por pierna.");
                System.out.println("3. Estiramiento de espalda y brazos – 1 minuto.");
                System.out.println("4. Respiraciones profundas y relajación – 2 minutos.");
            case "a":
                System.out.println("** Rutina de 30 Minutos para Nivel Avanzado **\n");

                // Calentamiento (5 minutos)
                System.out.println("** Calentamiento (5 minutos):");
                System.out.println("1. Saltos con cuerda (o simulación sin cuerda) – 3 minutos.");
                System.out.println("   - Aumenta el ritmo gradualmente.");
                System.out.println("2. Movilidad Articular – 2 minutos.");
                System.out.println("   - Círculos amplios de brazos.");
                System.out.println("   - Estiramiento dinámico de piernas (zancadas con torsión).");
                System.out.println("   - Activación del core con plancha rápida (20 segundos).\n");

                // Cardio Intenso (10 minutos)
                System.out.println("** Cardio Intenso (10 minutos):");
                System.out.println("1. Sprint en el lugar – 2 minutos.");
                System.out.println("   - Corre en el lugar elevando bien las rodillas.");
                System.out.println("2. Burpees explosivos – 2 minutos.");
                System.out.println("   - Con salto alto al final de cada burpee.");
                System.out.println("3. Sentadillas con salto alto – 2 minutos.");
                System.out.println("   - Aterriza suave y controla el descenso.");
                System.out.println("4. Jumping lunges (zancadas con salto) – 2 minutos.");
                System.out.println("   - Alterna rápidamente entre piernas.");
                System.out.println("5. Mountain climbers rápidos – 2 minutos.");
                System.out.println("   - Mantén el core firme y las caderas alineadas.\n");

                // Fuerza con Peso Corporal (10 minutos)
                System.out.println("** Ejercicios de Fuerza (10 minutos):");
                System.out.println("1. Flexiones con palmada o explosivas – 3 series de 12-15 repeticiones.");
                System.out.println("2. Plancha lateral con rotación – 3 series de 12 repeticiones por lado.");
                System.out.println("3. Sentadilla pistol (una pierna) – 2 series de 8-10 repeticiones por pierna.");
                System.out.println("4. Fondos en el suelo o silla (tríceps dips) – 3 series de 15-20 repeticiones.\n");

                // Enfriamiento y estiramientos (5 minutos)
                System.out.println("** Enfriamiento y Estiramientos (5 minutos):");
                System.out.println("1. Estiramiento de cuádriceps y glúteos – 1 minuto por pierna.");
                System.out.println("2. Estiramiento de espalda baja y hamstrings – 2 minutos.");
                System.out.println("3. Respiraciones profundas y estiramiento de brazos – 2 minutos.");

        }

    }
}
