package Stream;

import java.util.HashMap;
import java.util.Map;

public class StreamExerciseMap {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Luca", 25);
        people.put("Marco", 17);
        people.put("Anna", 30);
        people.put("Lorenzo", 15);
        people.put("Laura", 22);
    }

}

// 🔹 SNACK MAP 1 — Stampa solo le chiavi

// Ottieni la lista dei nomi.

// Output: List<String>

// 🔹 SNACK MAP 2 — Stampa solo i valori

// Ottieni la lista delle età.

// Output: List<Integer>

// 🔹 SNACK MAP 3 — Filtra maggiorenni

// Tieni solo le persone con età ≥ 18.

// Output: Map<String, Integer>

// 🔹 SNACK MAP 4 — Nomi che iniziano con L

// Filtra per chiave che inizia con "L".

// Output: Map<String, Integer>

// 🔹 SNACK MAP 5 — Nomi in maiuscolo

// Trasforma le chiavi in uppercase.

// Output: Map<String, Integer>

// 🔹 SNACK MAP 6 — Aumenta tutte le età di 1

// Incrementa tutti i valori.

// Output: Map<String, Integer>

// 🔹 SNACK MAP 7 — Filtra maggiorenni e nomi in maiuscolo

// Fai filter + map insieme.

// Output: Map<String, Integer>

// 🔹 SNACK MAP 8 — Ottieni solo i nomi dei maggiorenni

// Prima filtri, poi estrai solo le chiavi.

// Output: Set<String>

// 🔹 SNACK MAP 9 — Media delle età

// Calcola la media dei valori.

// Output: double

// 🔹 SNACK MAP 10 — Trova la persona più grande

// Entry con età massima.

// Output: Map.Entry<String, Integer>
